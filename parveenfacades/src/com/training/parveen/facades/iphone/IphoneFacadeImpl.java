/**
 *
 */
package com.training.parveen.facades.iphone;

import de.hybris.platform.commercefacades.custom.data.IphoneData;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import javax.annotation.Resource;

import com.training.parveen.core.iphone.service.IphoneService;
import com.training.parveen.core.model.IphoneModel;


/**
 * @author dell
 *
 */
public class IphoneFacadeImpl implements IphoneFacade
{

	@Resource
	private IphoneService iphoneService;
	private Converter<IphoneModel, IphoneData> iphoneConverter;

	@Override
	public List<IphoneData> getAllphone()
	{

		final List<IphoneModel> iphoneModels = getIphoneService().getAllPhone();
		return getIphoneConverter().convertAll(iphoneModels);

	}

	/**
	 * @return the iphoneService
	 */
	public IphoneService getIphoneService()
	{
		return iphoneService;
	}

	/**
	 * @param iphoneService
	 *                         the iphoneService to set
	 */
	public void setIphoneService(final IphoneService iphoneService)
	{
		this.iphoneService = iphoneService;
	}

	/**
	 * @return the iphoneConverter
	 */
	public Converter<IphoneModel, IphoneData> getIphoneConverter()
	{
		return iphoneConverter;
	}

	/**
	 * @param iphoneConverter
	 *                           the iphoneConverter to set
	 */
	public void setIphoneConverter(final Converter<IphoneModel, IphoneData> iphoneConverter)
	{
		this.iphoneConverter = iphoneConverter;
	}



}
