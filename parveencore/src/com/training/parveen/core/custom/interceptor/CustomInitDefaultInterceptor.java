/**
 *
 */
package com.training.parveen.core.custom.interceptor;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import org.apache.log4j.Logger;


/**
 * @author dell
 *
 */
public class CustomInitDefaultInterceptor implements InitDefaultsInterceptor<CustomerModel>
{
	private static final Logger LOGGER = Logger.getLogger(CustomInitDefaultInterceptor.class);

	@Override
	public void onInitDefaults(final CustomerModel model, final InterceptorContext ctx) throws InterceptorException
	{

		LOGGER.info("###########CustomInitDefaultInterceptor##############");
		if (model instanceof CustomerModel)
		{
			final CustomerModel customer = model;
			if (ctx.isNew(customer))
			{
				adjustDesc(customer);
			}
			else if (ctx.isModified(model, CustomerModel.ORIGINALUID) || ctx.isModified(model, CustomerModel.UID))
			{
				adjustDesc(customer);

			}
		}

	}

	private void adjustDesc(final CustomerModel customer)
	{
		customer.setDescription("apparel Customer");
	}
}

