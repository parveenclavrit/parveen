/**
 *
 */
package com.training.parveen.core.iphone;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.parveen.core.model.IphoneModel;


/**
 * @author dell
 *
 */
public class IphoneDao extends AbstractItemDao
{

	@Autowired
	public FlexibleSearchService flexibleSearchService;

	private static final String Iphone_QUERY = "SELECT {P.PK} FROM {Iphone AS P}";

	public List<IphoneModel> getAllIphone()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(Iphone_QUERY);
		final SearchResult<IphoneModel> result = getFlexibleSearchService().search(query);
		return result.getResult(); //list of Model objects.
	}
}
