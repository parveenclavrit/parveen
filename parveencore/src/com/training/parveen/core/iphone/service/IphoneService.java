/**
 *
 */
package com.training.parveen.core.iphone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.parveen.core.iphone.IphoneDao;
import com.training.parveen.core.model.IphoneModel;


/**
 * @author dell
 *
 */
public class IphoneService
{

	@Autowired
	IphoneDao iphoneDao;

	public List<IphoneModel> getAllPhone()
	{
		return iphoneDao.getAllIphone();
	}
}
