package org.asena.agans.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the moshtari database table.
 * 
 */
@Entity
@NamedQuery(name="Moshtari.findAll", query="SELECT m FROM Moshtari m")
public class Moshtari implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String adress;

	private String borndate;

	private String email;

	private String gender;

	private Boolean isdelete;

	private String name;

	private String phone;

	private String tozihat;

	//bi-directional many-to-one association to Serviceinfo
	@OneToMany(mappedBy="moshtari")
	private List<Serviceinfo> serviceinfos;

	public Moshtari() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getBorndate() {
		return this.borndate;
	}

	public void setBorndate(String borndate) {
		this.borndate = borndate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getIsdelete() {
		return this.isdelete;
	}

	public void setIsdelete(Boolean isdelete) {
		this.isdelete = isdelete;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTozihat() {
		return this.tozihat;
	}

	public void setTozihat(String tozihat) {
		this.tozihat = tozihat;
	}

	public List<Serviceinfo> getServiceinfos() {
		return this.serviceinfos;
	}

	public void setServiceinfos(List<Serviceinfo> serviceinfos) {
		this.serviceinfos = serviceinfos;
	}

	public Serviceinfo addServiceinfo(Serviceinfo serviceinfo) {
		getServiceinfos().add(serviceinfo);
		serviceinfo.setMoshtari(this);

		return serviceinfo;
	}

	public Serviceinfo removeServiceinfo(Serviceinfo serviceinfo) {
		getServiceinfos().remove(serviceinfo);
		serviceinfo.setMoshtari(null);

		return serviceinfo;
	}

}