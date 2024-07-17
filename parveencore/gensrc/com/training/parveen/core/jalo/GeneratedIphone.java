/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 15, 2024, 5:39:58 PM                    ---
 * ----------------------------------------------------------------
 */
package com.training.parveen.core.jalo;

import com.training.parveen.core.constants.ParveenCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Iphone}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedIphone extends GenericItem
{
	/** Qualifier of the <code>Iphone.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Iphone.price</code> attribute **/
	public static final String PRICE = "price";
	/** Qualifier of the <code>Iphone.color</code> attribute **/
	public static final String COLOR = "color";
	/** Qualifier of the <code>Iphone.model</code> attribute **/
	public static final String MODEL = "model";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(PRICE, AttributeMode.INITIAL);
		tmp.put(COLOR, AttributeMode.INITIAL);
		tmp.put(MODEL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Iphone.color</code> attribute.
	 * @return the color
	 */
	public String getColor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COLOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Iphone.color</code> attribute.
	 * @return the color
	 */
	public String getColor()
	{
		return getColor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Iphone.color</code> attribute. 
	 * @param value the color
	 */
	public void setColor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COLOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Iphone.color</code> attribute. 
	 * @param value the color
	 */
	public void setColor(final String value)
	{
		setColor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Iphone.model</code> attribute.
	 * @return the model
	 */
	public String getModel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Iphone.model</code> attribute.
	 * @return the model
	 */
	public String getModel()
	{
		return getModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Iphone.model</code> attribute. 
	 * @param value the model
	 */
	public void setModel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Iphone.model</code> attribute. 
	 * @param value the model
	 */
	public void setModel(final String value)
	{
		setModel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Iphone.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Iphone.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Iphone.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Iphone.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Iphone.price</code> attribute.
	 * @return the price
	 */
	public String getPrice(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Iphone.price</code> attribute.
	 * @return the price
	 */
	public String getPrice()
	{
		return getPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Iphone.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Iphone.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final String value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
}
