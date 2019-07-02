package org.asena.agans.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the hesabruzane database table.
 * 
 */
@Entity
@NamedQuery(name="Hesabruzane.findAll", query="SELECT h FROM Hesabruzane h")
public class Hesabruzane implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private Integer bedehi;

	private Timestamp date;

	private Integer megdar;

	//bi-directional many-to-one association to Driver
	@ManyToOne
	@JoinColumn(name="driverid")
	private Driver driver;

	//bi-directional many-to-one association to Hesabmahane
	@ManyToOne
	@JoinColumn(name="mahaneid")
	private Hesabmahane hesabmahane;

	public Hesabruzane() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getBedehi() {
		return this.bedehi;
	}

	public void setBedehi(Integer bedehi) {
		this.bedehi = bedehi;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Integer getMegdar() {
		return this.megdar;
	}

	public void setMegdar(Integer megdar) {
		this.megdar = megdar;
	}

	public Driver getDriver() {
		return this.driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Hesabmahane getHesabmahane() {
		return this.hesabmahane;
	}

	public void setHesabmahane(Hesabmahane hesabmahane) {
		this.hesabmahane = hesabmahane;
	}

}