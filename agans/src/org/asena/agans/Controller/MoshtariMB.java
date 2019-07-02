
package org.asena.agans.Controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.asena.baseService.JPAOp;
import org.asena.common.JSFHelper;
import org.asena.common.baseManagedBeanController;
import org.asena.common.exception.gException;
import org.asena.agans.Entity.Moshtari;
import org.asena.agans.ServiceInterface.MoshtariUCService;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name = "MoshtariMB")
@ViewScoped

public class MoshtariMB extends baseManagedBeanController<Moshtari> implements Serializable
{
	private static final long serialVersionUID = 7175342628505956385L;

	public MoshtariMB()
	{
	}


	//Services Deceleration
	@Autowired
	private MoshtariUCService moshtariService;



	//base Object, relations Lists (1-* objects)




	@Override
	protected void ResetBaseObject()
	{
		super.ResetBaseObject();

		// new Base Object 
		baseEntity = new Moshtari();

		// new other Objects and set them into Base object



		// refresh Lists
		baseEntityList = moshtariService.FindAll("id", JPAOp.Asc);
	}




	//UC: Add/Edit
	public void AddEdit() throws gException
	{
		String result = "";
		try
		{
			if (isedit)
				moshtariService.Edit(baseEntity);
			else
				result = moshtariService.Add(baseEntity);

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
	public void Remove(Moshtari baseEntity)
	{
		try
		{
			moshtariService.Remove(baseEntity);
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
