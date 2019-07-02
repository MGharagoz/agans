package org.asena.agans.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the rah database table.
 * 
 */
@Entity
@NamedQuery(name="Rah.findAll", query="SELECT r FROM Rah r")
public class Rah implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String name;

	//bi-directional many-to-one association to Tagato
	@ManyToOne
	@JoinColumn(name="ebtedatagato")
	private Tagato tagato1;

	//bi-directional many-to-one association to Tagato
	@ManyToOne
	@JoinColumn(name="entehatagato")
	private Tagato tagato2;

	//bi-directional many-to-one association to Rahtype
	@ManyToOne
	@JoinColumn(name="rahtypeid")
	private Rahtype rahtype;

	//bi-directional many-to-one association to Tafere
	@ManyToOne
	@JoinColumn(name="tarefeid")
	private Tafere tafere;

	//bi-directional many-to-one association to Serviceinfo
	@OneToMany(mappedBy="rah1")
	private List<Serviceinfo> serviceinfos1;

	//bi-directional many-to-one association to Serviceinfo
	@OneToMany(mappedBy="rah2")
	private List<Serviceinfo> serviceinfos2;

	public Rah() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tagato getTagato1() {
		return this.tagato1;
	}

	public void setTagato1(Tagato tagato1) {
		this.tagato1 = tagato1;
	}

	public Tagato getTagato2() {
		return this.tagato2;
	}

	public void setTagato2(Tagato tagato2) {
		this.tagato2 = tagato2;
	}

	public Rahtype getRahtype() {
		return this.rahtype;
	}

	public void setRahtype(Rahtype rahtype) {
		this.rahtype = rahtype;
	}

	public Tafere getTafere() {
		return this.tafere;
	}

	public void setTafere(Tafere tafere) {
		this.tafere = tafere;
	}

	public List<Serviceinfo> getServiceinfos1() {
		return this.serviceinfos1;
	}

	public void setServiceinfos1(List<Serviceinfo> serviceinfos1) {
		this.serviceinfos1 = serviceinfos1;
	}

	public Serviceinfo addServiceinfos1(Serviceinfo serviceinfos1) {
		getServiceinfos1().add(serviceinfos1);
		serviceinfos1.setRah1(this);

		return serviceinfos1;
	}

	public Serviceinfo removeServiceinfos1(Serviceinfo serviceinfos1) {
		getServiceinfos1().remove(serviceinfos1);
		serviceinfos1.setRah1(null);

		return serviceinfos1;
	}

	public List<Serviceinfo> getServiceinfos2() {
		return this.serviceinfos2;
	}

	public void setServiceinfos2(List<Serviceinfo> serviceinfos2) {
		this.serviceinfos2 = serviceinfos2;
	}

	public Serviceinfo addServiceinfos2(Serviceinfo serviceinfos2) {
		getServiceinfos2().add(serviceinfos2);
		serviceinfos2.setRah2(this);

		return serviceinfos2;
	}

	public Serviceinfo removeServiceinfos2(Serviceinfo serviceinfos2) {
		getServiceinfos2().remove(serviceinfos2);
		serviceinfos2.setRah2(null);

		return serviceinfos2;
	}

}