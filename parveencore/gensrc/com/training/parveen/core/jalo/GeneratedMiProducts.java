/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 15, 2024, 5:39:58 PM                    ---
 * ----------------------------------------------------------------
 */
package com.training.parveen.core.jalo;

import com.training.parveen.core.constants.ParveenCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product MiProducts}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMiProducts extends Product
{
	/** Qualifier of the <code>MiProducts.model</code> attribute **/
	public static final String MODEL = "model";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MODEL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiProducts.model</code> attribute.
	 * @return the model - model
	 */
	public String getModel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiProducts.model</code> attribute.
	 * @return the model - model
	 */
	public String getModel()
	{
		return getModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiProducts.model</code> attribute. 
	 * @param value the model - model
	 */
	public void setModel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiProducts.model</code> attribute. 
	 * @param value the model - model
	 */
	public void setModel(final String value)
	{
		setModel( getSession().getSessionContext(), value );
	}
	
}
