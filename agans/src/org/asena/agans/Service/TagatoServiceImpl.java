package org.asena.agans.Service;

import org.asena.agans.ServiceInterface.TagatoUCService;
import org.asena.agans.Entity.Tagato;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TagatoServiceImpl extends baseUCServiceImpl<Tagato> implements TagatoUCService
{

	@Override
	@Transactional
	public String Add(Tagato entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Tagato Edit(Tagato entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Tagato entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
