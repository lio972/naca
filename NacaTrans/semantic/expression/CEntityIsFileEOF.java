/*
 * NacaTrans - Naca Transcoder v1.2.0.
 *
 * Copyright (c) 2008-2009 Publicitas SA.
 * Licensed under GPL (GPL-LICENSE.txt) license.
 */
/*
 * NacaRTTests - Naca Tests for NacaRT support.
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Publicitas SA.
 * Licensed under GPL (GPL-LICENSE.txt) license.
 */
package semantic.expression;

import semantic.CBaseEntityFactory;
import semantic.CDataEntity;
import semantic.CEntityFileDescriptor;

/**
 * @author S. Charton
 * @version $Id$
 */
public abstract class CEntityIsFileEOF extends CBaseEntityCondition
{
	protected CEntityFileDescriptor m_FileDescriptor ;
	/**
	 * @param fb 
	 * 
	 */
	public CEntityIsFileEOF(CEntityFileDescriptor fb)
	{
		super();
		m_FileDescriptor = fb ;
	}


	/**
	 * @see semantic.expression.CBaseEntityCondition#isBinaryCondition()
	 */
	@Override
	public boolean isBinaryCondition()
	{
		return false;
	}

	/**
	 * @see semantic.expression.CBaseEntityCondition#GetSpecialConditionReplacing(java.lang.String, semantic.CBaseEntityFactory, semantic.CDataEntity)
	 */
	@Override
	public CBaseEntityCondition GetSpecialConditionReplacing(String val, CBaseEntityFactory fact, CDataEntity replace)
	{
		return null;
	}
	
	@Override
	public boolean ignore()
	{
		return m_FileDescriptor.ignore() ;
	}
	/**
	 * @see semantic.expression.CBaseEntityCondition#GetConditionReference()
	 */
	@Override
	public CDataEntity GetConditionReference()
	{
		return null;
	}
	public void SetConditonReference(CDataEntity e)
	{
		ASSERT(null) ;
	}

}
