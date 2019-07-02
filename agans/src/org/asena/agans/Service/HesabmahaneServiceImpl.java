package org.asena.agans.Service;

import org.asena.agans.ServiceInterface.HesabmahaneUCService;
import org.asena.agans.Entity.Hesabmahane;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class HesabmahaneServiceImpl extends baseUCServiceImpl<Hesabmahane> implements HesabmahaneUCService
{

	@Override
	@Transactional
	public String Add(Hesabmahane entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Hesabmahane Edit(Hesabmahane entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Hesabmahane entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
