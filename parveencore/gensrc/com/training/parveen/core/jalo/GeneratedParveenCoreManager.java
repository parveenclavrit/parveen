/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 15, 2024, 5:39:58 PM                    ---
 * ----------------------------------------------------------------
 */
package com.training.parveen.core.jalo;

import com.training.parveen.core.constants.ParveenCoreConstants;
import com.training.parveen.core.jalo.ApparelProduct;
import com.training.parveen.core.jalo.ApparelSizeVariantProduct;
import com.training.parveen.core.jalo.ApparelStyleVariantProduct;
import com.training.parveen.core.jalo.ClavritItemType;
import com.training.parveen.core.jalo.ElectronicsColorVariantProduct;
import com.training.parveen.core.jalo.Iphone;
import com.training.parveen.core.jalo.MiProducts;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>ParveenCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedParveenCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("productAvailable", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("birthdate", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.birthdate</code> attribute.
	 * @return the birthdate
	 */
	public Date getBirthdate(final SessionContext ctx, final Customer item)
	{
		return (Date)item.getProperty( ctx, ParveenCoreConstants.Attributes.Customer.BIRTHDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.birthdate</code> attribute.
	 * @return the birthdate
	 */
	public Date getBirthdate(final Customer item)
	{
		return getBirthdate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.birthdate</code> attribute. 
	 * @param value the birthdate
	 */
	public void setBirthdate(final SessionContext ctx, final Customer item, final Date value)
	{
		item.setProperty(ctx, ParveenCoreConstants.Attributes.Customer.BIRTHDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.birthdate</code> attribute. 
	 * @param value the birthdate
	 */
	public void setBirthdate(final Customer item, final Date value)
	{
		setBirthdate( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ParveenCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ParveenCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ParveenCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ClavritItemType createClavritItemType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ParveenCoreConstants.TC.CLAVRITITEMTYPE );
			return (ClavritItemType)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ClavritItemType : "+e.getMessage(), 0 );
		}
	}
	
	public ClavritItemType createClavritItemType(final Map attributeValues)
	{
		return createClavritItemType( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ParveenCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Iphone createIphone(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ParveenCoreConstants.TC.IPHONE );
			return (Iphone)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Iphone : "+e.getMessage(), 0 );
		}
	}
	
	public Iphone createIphone(final Map attributeValues)
	{
		return createIphone( getSession().getSessionContext(), attributeValues );
	}
	
	public MiProducts createMiProducts(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ParveenCoreConstants.TC.MIPRODUCTS );
			return (MiProducts)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MiProducts : "+e.getMessage(), 0 );
		}
	}
	
	public MiProducts createMiProducts(final Map attributeValues)
	{
		return createMiProducts( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return ParveenCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productAvailable</code> attribute.
	 * @return the productAvailable
	 */
	public Boolean isProductAvailable(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, ParveenCoreConstants.Attributes.Product.PRODUCTAVAILABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productAvailable</code> attribute.
	 * @return the productAvailable
	 */
	public Boolean isProductAvailable(final Product item)
	{
		return isProductAvailable( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productAvailable</code> attribute. 
	 * @return the productAvailable
	 */
	public boolean isProductAvailableAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isProductAvailable( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productAvailable</code> attribute. 
	 * @return the productAvailable
	 */
	public boolean isProductAvailableAsPrimitive(final Product item)
	{
		return isProductAvailableAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productAvailable</code> attribute. 
	 * @param value the productAvailable
	 */
	public void setProductAvailable(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, ParveenCoreConstants.Attributes.Product.PRODUCTAVAILABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productAvailable</code> attribute. 
	 * @param value the productAvailable
	 */
	public void setProductAvailable(final Product item, final Boolean value)
	{
		setProductAvailable( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productAvailable</code> attribute. 
	 * @param value the productAvailable
	 */
	public void setProductAvailable(final SessionContext ctx, final Product item, final boolean value)
	{
		setProductAvailable( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productAvailable</code> attribute. 
	 * @param value the productAvailable
	 */
	public void setProductAvailable(final Product item, final boolean value)
	{
		setProductAvailable( getSession().getSessionContext(), item, value );
	}
	
}
