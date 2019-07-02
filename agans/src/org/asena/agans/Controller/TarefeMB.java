package org.asena.agans.Controller;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.asena.baseService.JPAOp;
import org.asena.common.JSFHelper;
import org.asena.common.baseManagedBeanController;
import org.asena.common.exception.gException;
import org.asena.agans.Entity.Tafere;
import org.asena.agans.ServiceInterface.TafereUCService;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name = "TafereMB")
@ViewScoped

public class TarefeMB extends baseManagedBeanController<Tafere> implements Serializable
{
	private static final long serialVersionUID = 7175212628505956385L;

	public TarefeMB()
	{
	}


	//Services Deceleration
	@Autowired
	private TafereUCService tafereService;




	//base Object, relations Lists (1-* objects)




	@Override
	protected void ResetBaseObject()
	{
		super.ResetBaseObject();

		// new Base Object 
		baseEntity = new Tafere();

		// new other Objects and set them into Base object



		// refresh Lists
		baseEntityList = tafereService.FindAll("id", JPAOp.Asc);
	}




	//UC: Add/Edit
	public void AddEdit() throws gException
	{
		String result = "";
		try
		{
			if (isedit)
				tafereService.Edit(baseEntity);
			else
				result = tafereService.Add(baseEntity);

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
	public void Remove(Tafere baseEntity)
	{
		try
		{
			tafereService.Remove(baseEntity);
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
