/**
 *
 */
package com.training.parveen.storefront.iphone.controller;

import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.custom.data.IphoneData;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.NotWritablePropertyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.parveen.facades.iphone.IphoneFacade;
import com.training.parveen.storefront.controllers.ControllerConstants;


/**
 * @author dell
 *
 */
@Controller

@RequestMapping("/iphone")
public class IphoneController
{

	@Resource(name = "iphoneFacade")
	private IphoneFacade iphoneFacade;

	@RequestMapping(value = "/details", method = RequestMethod.GET)

	@RequireHardLogIn
	public String getIphone(final Model model) throws CMSItemNotFoundException, NotWritablePropertyException
	{
		System.out.println("Test controller");
		final List<IphoneData> iphoneTableDetails = iphoneFacade.getAllphone();
		System.out.println("iphone details=" + iphoneTableDetails);
		model.addAttribute("iphoneTableDetails", iphoneTableDetails);

		return ControllerConstants.Views.Pages.Account.IphonePage;
	}

}
