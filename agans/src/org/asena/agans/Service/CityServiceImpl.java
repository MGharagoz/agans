package org.asena.agans.Service;

import org.asena.agans.ServiceInterface.CityUCService;
import org.asena.agans.Entity.City;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CityServiceImpl extends baseUCServiceImpl<City> implements CityUCService
{

	@Override
	@Transactional
	public String Add(City entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public City Edit(City entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(City entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
