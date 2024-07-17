/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.training.parveen.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.training.parveen.fulfilmentprocess.constants.ParveenFulfilmentProcessConstants;

public class ParveenFulfilmentProcessManager extends GeneratedParveenFulfilmentProcessManager
{
	public static final ParveenFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ParveenFulfilmentProcessManager) em.getExtension(ParveenFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
