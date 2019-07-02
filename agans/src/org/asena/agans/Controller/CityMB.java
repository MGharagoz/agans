
package org.asena.agans.Controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.asena.baseService.JPAOp;
import org.asena.common.JSFHelper;
import org.asena.common.baseManagedBeanController;
import org.asena.common.exception.gException;
import org.asena.agans.Entity.City;
import org.asena.agans.Entity.Ostan;
import org.asena.agans.ServiceInterface.CityUCService;
import org.asena.agans.ServiceInterface.OstanUCService;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name = "CityMB")
@ViewScoped

public class CityMB extends baseManagedBeanController<City> implements Serializable
{
	private static final long serialVersionUID = 7175342648505956385L;

	public CityMB()
	{
	}


	//Services Deceleration
	@Autowired
	private CityUCService CityService;

	@Autowired
	private OstanUCService ostanService;




	//base Object, relations Lists (1-* objects)
	public List<Ostan> FindAll_Ostan()
	{
		return ostanService.FindAll("id", JPAOp.Asc);
	}



	@Override
	protected void ResetBaseObject()
	{
		super.ResetBaseObject();

		// new Base Object 
		baseEntity = new City();

		// new other Objects and set them into Base object
		if (null == baseEntity.getOstan())
			baseEntity.setOstan(new Ostan());


		// refresh Lists
		baseEntityList = CityService.FindAll("ostan", JPAOp.Asc, "id", JPAOp.Asc);
	}




	//UC: Add/Edit
	public void AddEdit() throws gException
	{
		String result = "";
		try
		{
			if (isedit)
				CityService.Edit(baseEntity);
			else
				result = CityService.Add(baseEntity);

			ResetBaseObject();


			if (result.length() >= 1)
				JSFHelper.addInfoMessage(result);
			else
				JSFHelper.addInfoMessage("عملیات ثبت / ویرایش اطلاعات با موفقیت انجام شد");

		}
		catch (Exception ex)
		{
			CallCatch(ex);
		}

	}




	//UC: Remove
	public void Remove(City baseEntity)
	{
		try
		{
			CityService.Remove(baseEntity);
			ResetBaseObject();
			JSFHelper.addInfoMessage("عملیات حذف اطلاعات با موفقیت انجام شد.");
		}
		catch (Exception ex)
		{
			CallCatch(ex);
		}
	}




	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    Setters & Getters
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    Setters & Getters




}
