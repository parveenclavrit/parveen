/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.training.parveen.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.training.parveen.core.constants.ParveenCoreConstants;
import com.training.parveen.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class ParveenCoreManager extends GeneratedParveenCoreManager
{
	public static final ParveenCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ParveenCoreManager) em.getExtension(ParveenCoreConstants.EXTENSIONNAME);
	}
}
