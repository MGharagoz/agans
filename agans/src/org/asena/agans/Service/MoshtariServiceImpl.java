package org.asena.agans.Service;

import org.asena.agans.ServiceInterface.MoshtariUCService;
import org.asena.agans.Entity.Moshtari;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MoshtariServiceImpl extends baseUCServiceImpl<Moshtari> implements MoshtariUCService
{

	@Override
	@Transactional
	public String Add(Moshtari entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Moshtari Edit(Moshtari entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Moshtari entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
