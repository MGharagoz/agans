package org.asena.agans.Service;

import org.asena.agans.ServiceInterface.RahtypeUCService;
import org.asena.agans.Entity.Rahtype;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RahtypeServiceImpl extends baseUCServiceImpl<Rahtype> implements RahtypeUCService
{

	@Override
	@Transactional
	public String Add(Rahtype entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Rahtype Edit(Rahtype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Rahtype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
