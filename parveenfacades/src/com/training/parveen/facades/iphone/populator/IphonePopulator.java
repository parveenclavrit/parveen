/**
 *
 */
package com.training.parveen.facades.iphone.populator;

import de.hybris.platform.commercefacades.custom.data.IphoneData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.training.parveen.core.model.IphoneModel;


/**
 * @author dell
 *
 */
public class IphonePopulator implements Populator<IphoneModel, IphoneData>
{

	@Override
	public void populate(final IphoneModel source, final IphoneData target) throws ConversionException
	{
		target.setName(source.getName());
		target.setPrice(source.getPrice());
		target.setColor(source.getColor());
		target.setModel(source.getModel());

	}

}
