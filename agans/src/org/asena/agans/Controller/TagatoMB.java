
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
import org.asena.agans.Entity.Tagato;
import org.asena.agans.Entity.Tagatotype;
import org.asena.agans.ServiceInterface.CityUCService;
import org.asena.agans.ServiceInterface.TagatoUCService;
import org.asena.agans.ServiceInterface.TagatotypeUCService;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name = "TagatoMB")
@ViewScoped

public class TagatoMB extends baseManagedBeanController<Tagato> implements Serializable
{
	private static final long serialVersionUID = 7175342648505956385L;

	public TagatoMB()
	{
	}


	//Services Deceleration
	@Autowired
	private TagatoUCService tagatoService;

	@Autowired
	private TagatotypeUCService tagatotypeService;
	@Autowired
	private CityUCService cityService;



	//base Object, relations Lists (1-* objects)
	public List<Tagatotype> FindAll_Tagatotype()
	{
		return tagatotypeService.FindAll("id", JPAOp.Asc);
	}

	public List<City> FindAll_City()
	{
		return cityService.FindAll("id", JPAOp.Asc);
	}

	@Override
	protected void ResetBaseObject()
	{
		super.ResetBaseObject();

		// new Base Object 
		baseEntity = new Tagato();

		// new other Objects and set them into Base object
		if (null == baseEntity.getTagatotype())
			baseEntity.setTagatotype(new Tagatotype());

		if (null == baseEntity.getCity())
			baseEntity.setCity(new City());
		// refresh Lists
		baseEntityList = tagatoService.FindAll("tagatotype", JPAOp.Asc, "id", JPAOp.Asc);
		baseEntityList = tagatoService.FindAll("city", JPAOp.Asc, "id", JPAOp.Asc);
	}




	//UC: Add/Edit
	public void AddEdit() throws gException
	{
		String result = "";
		try
		{
			if (isedit)
				tagatoService.Edit(baseEntity);
			else
				result = tagatoService.Add(baseEntity);

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
	public void Remove(Tagato baseEntity)
	{
		try
		{
			tagatoService.Remove(baseEntity);
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
