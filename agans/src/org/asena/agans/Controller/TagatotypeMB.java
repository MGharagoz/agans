package org.asena.agans.Controller;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.asena.baseService.JPAOp;
import org.asena.common.JSFHelper;
import org.asena.common.baseManagedBeanController;
import org.asena.common.exception.gException;
import org.asena.agans.Entity.Tagatotype;
import org.asena.agans.ServiceInterface.TagatotypeUCService;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name = "TagatotypeMB")
@ViewScoped

public class TagatotypeMB extends baseManagedBeanController<Tagatotype> implements Serializable
{
	private static final long serialVersionUID = 7175212628505956385L;

	public TagatotypeMB()
	{
	}


	//Services Deceleration
	@Autowired
	private TagatotypeUCService tagatotypeService;




	//base Object, relations Lists (1-* objects)




	@Override
	protected void ResetBaseObject()
	{
		super.ResetBaseObject();

		// new Base Object 
		baseEntity = new Tagatotype();

		// new other Objects and set them into Base object



		// refresh Lists
		baseEntityList = tagatotypeService.FindAll("id", JPAOp.Asc);
	}




	//UC: Add/Edit
	public void AddEdit() throws gException
	{
		String result = "";
		try
		{
			if (isedit)
				tagatotypeService.Edit(baseEntity);
			else
				result = tagatotypeService.Add(baseEntity);

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
	public void Remove(Tagatotype baseEntity)
	{
		try
		{
			tagatotypeService.Remove(baseEntity);
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
