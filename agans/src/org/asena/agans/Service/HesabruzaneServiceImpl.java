package org.asena.agans.Service;

import org.asena.agans.ServiceInterface.HesabruzaneUCService;
import org.asena.agans.Entity.Hesabruzane;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class HesabruzaneServiceImpl extends baseUCServiceImpl<Hesabruzane> implements HesabruzaneUCService
{

	@Override
	@Transactional
	public String Add(Hesabruzane entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Hesabruzane Edit(Hesabruzane entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Hesabruzane entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
