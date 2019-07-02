package org.asena.agans.Service;

import org.asena.agans.ServiceInterface.TagatotypeUCService;
import org.asena.agans.Entity.Tagatotype;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TagatotypeServiceImpl extends baseUCServiceImpl<Tagatotype> implements TagatotypeUCService
{

	@Override
	@Transactional
	public String Add(Tagatotype entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Tagatotype Edit(Tagatotype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Tagatotype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
