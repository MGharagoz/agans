package org.asena.agans.Controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.asena.baseService.JPAOp;
import org.asena.common.JSFHelper;
import org.asena.common.baseManagedBeanController;
import org.asena.common.exception.gException;
import org.asena.agans.Entity.Tagato;
import org.asena.agans.Entity.Rah;
import org.asena.agans.Entity.Rahtype;
import org.asena.agans.Entity.Tafere;
import org.asena.agans.ServiceInterface.TagatoUCService;
import org.asena.agans.ServiceInterface.RahUCService;
import org.asena.agans.ServiceInterface.RahtypeUCService;
import org.asena.agans.ServiceInterface.TafereUCService;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name = "RahMB")
@ViewScoped

public class RahMB extends baseManagedBeanController<Rah> implements Serializable
{
	private static final long serialVersionUID = 7175342648505956385L;

	public RahMB()
	{
	}


	//Services Deceleration
	@Autowired
	private RahUCService RahService;

	@Autowired
	private RahtypeUCService rahtypeService;

	@Autowired
	private TafereUCService tafereService;



	//base Object, relations Lists (1-* objects)
	public List<Rahtype> FindAll_Rahtype()
	{
		return rahtypeService.FindAll("id", JPAOp.Asc);
	}

	public List<Tafere> FindAll_Tafere()
	{
		return tafereService.FindAll("id", JPAOp.Asc);
	}

	@Override
	protected void ResetBaseObject()
	{
		super.ResetBaseObject();

		// new Base Object 
		baseEntity = new Rah();

		// new other Objects and set them into Base object
		if (null == baseEntity.getRahtype())
			baseEntity.setRahtype(new Rahtype());

		
		if (null == baseEntity.getTafere())
			baseEntity.setTafere(new Tafere());
		
		// refresh Lists
		baseEntityList = RahService.FindAll("rahtype", JPAOp.Asc, "id", JPAOp.Asc);
		baseEntityList = RahService.FindAll("tafere", JPAOp.Asc, "id", JPAOp.Asc);
	}




	//UC: Add/Edit
	public void AddEdit() throws gException
	{
		String result = "";
		try
		{
			if (isedit)
				RahService.Edit(baseEntity);
			else
				result = RahService.Add(baseEntity);

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
	public void Remove(Rah baseEntity)
	{
		try
		{
			RahService.Remove(baseEntity);
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
