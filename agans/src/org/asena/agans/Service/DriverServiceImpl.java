package org.asena.agans.Service;

import org.asena.agans.ServiceInterface.DriverUCService;
import org.asena.agans.Entity.Driver;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class DriverServiceImpl extends baseUCServiceImpl<Driver> implements DriverUCService
{

	@Override
	@Transactional
	public String Add(Driver entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Driver Edit(Driver entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Driver entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
