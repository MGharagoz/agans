package org.asena.agans.Service;

import org.asena.agans.ServiceInterface.RahUCService;
import org.asena.agans.Entity.Rah;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RahServiceImpl extends baseUCServiceImpl<Rah> implements RahUCService
{

	@Override
	@Transactional
	public String Add(Rah entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Rah Edit(Rah entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Rah entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
