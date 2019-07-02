package org.asena.agans.Service;

import org.asena.agans.ServiceInterface.TafereUCService;
import org.asena.agans.Entity.Tafere;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TafereServiceImpl extends baseUCServiceImpl<Tafere> implements TafereUCService
{

	@Override
	@Transactional
	public String Add(Tafere entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Tafere Edit(Tafere entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Tafere entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
