package org.asena.agans.Service;

import org.asena.agans.ServiceInterface.HesabsalaneUCService;
import org.asena.agans.Entity.Hesabsalane;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class HesabsalaneServiceImpl extends baseUCServiceImpl<Hesabsalane> implements HesabsalaneUCService
{

	@Override
	@Transactional
	public String Add(Hesabsalane entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Hesabsalane Edit(Hesabsalane entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Hesabsalane entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
