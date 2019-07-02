package org.asena.agans.Controller;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.asena.baseService.JPAOp;
import org.asena.common.JSFHelper;
import org.asena.common.baseManagedBeanController;
import org.asena.common.exception.gException;
import org.asena.agans.Entity.Rahtype;
import org.asena.agans.ServiceInterface.RahtypeUCService;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name = "RahtypeMB")
@ViewScoped

public class RahtypeMB extends baseManagedBeanController<Rahtype> implements Serializable
{
	private static final long serialVersionUID = 7175212628505956385L;

	public RahtypeMB()
	{
	}


	//Services Deceleration
	@Autowired
	private RahtypeUCService rahtypeService;




	//base Object, relations Lists (1-* objects)




	@Override
	protected void ResetBaseObject()
	{
		super.ResetBaseObject();

		// new Base Object 
		baseEntity = new Rahtype();

		// new other Objects and set them into Base object



		// refresh Lists
		baseEntityList = rahtypeService.FindAll("id", JPAOp.Asc);
	}




	//UC: Add/Edit
	public void AddEdit() throws gException
	{
		String result = "";
		try
		{
			if (isedit)
				rahtypeService.Edit(baseEntity);
			else
				result = rahtypeService.Add(baseEntity);

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
	public void Remove(Rahtype baseEntity)
	{
		try
		{
			rahtypeService.Remove(baseEntity);
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
