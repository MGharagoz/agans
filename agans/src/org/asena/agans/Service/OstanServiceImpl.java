package org.asena.agans.Service;

import org.asena.agans.ServiceInterface.OstanUCService;
import org.asena.agans.Entity.Ostan;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class OstanServiceImpl extends baseUCServiceImpl<Ostan> implements OstanUCService
{

	@Override
	@Transactional
	public String Add(Ostan entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Ostan Edit(Ostan entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Ostan entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
