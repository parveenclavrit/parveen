/**
 *
 */
package com.training.parveen.facades.customer.age;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


/**
 * @author dell
 *
 */
public class CustomerAgePopulator implements Populator<CustomerModel, CustomerData>
{

	@Override
	public void populate(final CustomerModel source, final CustomerData target) throws ConversionException
	{
		target.setCustomerAge(source.getCustomerAge());

	}

}
