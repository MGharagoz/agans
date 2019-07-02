package org.asena.agans.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the serviceinfo database table.
 * 
 */
@Entity
@NamedQuery(name="Serviceinfo.findAll", query="SELECT s FROM Serviceinfo s")
public class Serviceinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private Timestamp date;

	private Integer emtiyaz;

	private Integer hazine;

	//bi-directional many-to-one association to Driver
	@ManyToOne
	@JoinColumn(name="driverid")
	private Driver driver;

	//bi-directional many-to-one association to Moshtari
	@ManyToOne
	@JoinColumn(name="moshtariid")
	private Moshtari moshtari;

	//bi-directional many-to-one association to Rah
	@ManyToOne
	@JoinColumn(name="mabda")
	private Rah rah1;

	//bi-directional many-to-one association to Rah
	@ManyToOne
	@JoinColumn(name="magsad")
	private Rah rah2;

	public Serviceinfo() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Integer getEmtiyaz() {
		return this.emtiyaz;
	}

	public void setEmtiyaz(Integer emtiyaz) {
		this.emtiyaz = emtiyaz;
	}

	public Integer getHazine() {
		return this.hazine;
	}

	public void setHazine(Integer hazine) {
		this.hazine = hazine;
	}

	public Driver getDriver() {
		return this.driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Moshtari getMoshtari() {
		return this.moshtari;
	}

	public void setMoshtari(Moshtari moshtari) {
		this.moshtari = moshtari;
	}

	public Rah getRah1() {
		return this.rah1;
	}

	public void setRah1(Rah rah1) {
		this.rah1 = rah1;
	}

	public Rah getRah2() {
		return this.rah2;
	}

	public void setRah2(Rah rah2) {
		this.rah2 = rah2;
	}

}