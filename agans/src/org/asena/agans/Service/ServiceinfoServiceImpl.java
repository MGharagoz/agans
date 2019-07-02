package org.asena.agans.Service;

import org.asena.agans.ServiceInterface.ServiceinfoUCService;
import org.asena.agans.Entity.Serviceinfo;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ServiceinfoServiceImpl extends baseUCServiceImpl<Serviceinfo> implements ServiceinfoUCService
{

	@Override
	@Transactional
	public String Add(Serviceinfo entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Serviceinfo Edit(Serviceinfo entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Serviceinfo entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
