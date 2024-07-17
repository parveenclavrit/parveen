/**
 *
 */
package com.training.parveen.core.agehandler;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;

import java.util.Calendar;
import java.util.Date;


/**
 * @author dell
 *
 */
public class CustomerAgeHandler extends AbstractDynamicAttributeHandler<Integer, CustomerModel>
{
	@Override
	public Integer get(final CustomerModel model)
	{

		int customerSiteAge = 0;
		try
		{
			final Date customerbirthDate = model.getBirthdate();
						final Calendar cal = Calendar.getInstance();
						cal.setTime(customerbirthDate);
						final int birthYear = cal.get(Calendar.YEAR);
						final int currentYear = Calendar.getInstance().get(Calendar.YEAR);
						customerSiteAge = currentYear - birthYear;
		}
		catch (final Exception e)
		{
			e.printStackTrace();
		}
		return customerSiteAge;
	}
}
