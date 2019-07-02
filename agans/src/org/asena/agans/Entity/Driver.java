package org.asena.agans.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the driver database table.
 * 
 */
@Entity
@NamedQuery(name="Driver.findAll", query="SELECT d FROM Driver d")
public class Driver implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String borndate;

	private String carmodel;

	private String carname;

	private String gender;

	private Boolean isdelete;

	private String name;

	private String pelak;

	private String phone;

	private String rang;

	private String tozihat;

	//bi-directional many-to-one association to Hesabruzane
	@OneToMany(mappedBy="driver")
	private List<Hesabruzane> hesabruzanes;

	//bi-directional many-to-one association to Serviceinfo
	@OneToMany(mappedBy="driver")
	private List<Serviceinfo> serviceinfos;

	public Driver() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBorndate() {
		return this.borndate;
	}

	public void setBorndate(String borndate) {
		this.borndate = borndate;
	}

	public String getCarmodel() {
		return this.carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public String getCarname() {
		return this.carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
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

	public String getPelak() {
		return this.pelak;
	}

	public void setPelak(String pelak) {
		this.pelak = pelak;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRang() {
		return this.rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}

	public String getTozihat() {
		return this.tozihat;
	}

	public void setTozihat(String tozihat) {
		this.tozihat = tozihat;
	}

	public List<Hesabruzane> getHesabruzanes() {
		return this.hesabruzanes;
	}

	public void setHesabruzanes(List<Hesabruzane> hesabruzanes) {
		this.hesabruzanes = hesabruzanes;
	}

	public Hesabruzane addHesabruzane(Hesabruzane hesabruzane) {
		getHesabruzanes().add(hesabruzane);
		hesabruzane.setDriver(this);

		return hesabruzane;
	}

	public Hesabruzane removeHesabruzane(Hesabruzane hesabruzane) {
		getHesabruzanes().remove(hesabruzane);
		hesabruzane.setDriver(null);

		return hesabruzane;
	}

	public List<Serviceinfo> getServiceinfos() {
		return this.serviceinfos;
	}

	public void setServiceinfos(List<Serviceinfo> serviceinfos) {
		this.serviceinfos = serviceinfos;
	}

	public Serviceinfo addServiceinfo(Serviceinfo serviceinfo) {
		getServiceinfos().add(serviceinfo);
		serviceinfo.setDriver(this);

		return serviceinfo;
	}

	public Serviceinfo removeServiceinfo(Serviceinfo serviceinfo) {
		getServiceinfos().remove(serviceinfo);
		serviceinfo.setDriver(null);

		return serviceinfo;
	}

}