package org.asena.agans.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the hesabsalane database table.
 * 
 */
@Entity
@NamedQuery(name="Hesabsalane.findAll", query="SELECT h FROM Hesabsalane h")
public class Hesabsalane implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private Timestamp finishdate;

	private Long kharj;

	private Long megdar;

	private Timestamp startdate;

	private Long sud;

	//bi-directional many-to-one association to Hesabmahane
	@OneToMany(mappedBy="hesabsalane")
	private List<Hesabmahane> hesabmahanes;

	public Hesabsalane() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getFinishdate() {
		return this.finishdate;
	}

	public void setFinishdate(Timestamp finishdate) {
		this.finishdate = finishdate;
	}

	public Long getKharj() {
		return this.kharj;
	}

	public void setKharj(Long kharj) {
		this.kharj = kharj;
	}

	public Long getMegdar() {
		return this.megdar;
	}

	public void setMegdar(Long megdar) {
		this.megdar = megdar;
	}

	public Timestamp getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Timestamp startdate) {
		this.startdate = startdate;
	}

	public Long getSud() {
		return this.sud;
	}

	public void setSud(Long sud) {
		this.sud = sud;
	}

	public List<Hesabmahane> getHesabmahanes() {
		return this.hesabmahanes;
	}

	public void setHesabmahanes(List<Hesabmahane> hesabmahanes) {
		this.hesabmahanes = hesabmahanes;
	}

	public Hesabmahane addHesabmahane(Hesabmahane hesabmahane) {
		getHesabmahanes().add(hesabmahane);
		hesabmahane.setHesabsalane(this);

		return hesabmahane;
	}

	public Hesabmahane removeHesabmahane(Hesabmahane hesabmahane) {
		getHesabmahanes().remove(hesabmahane);
		hesabmahane.setHesabsalane(null);

		return hesabmahane;
	}

}