package org.asena.agans.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the hesabmahane database table.
 * 
 */
@Entity
@NamedQuery(name="Hesabmahane.findAll", query="SELECT h FROM Hesabmahane h")
public class Hesabmahane implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private Timestamp finishdate;

	private Long kaharj;

	private Long megdar;

	private Timestamp startdate;

	private Long sud;

	//bi-directional many-to-one association to Hesabsalane
	@ManyToOne
	@JoinColumn(name="salaneid")
	private Hesabsalane hesabsalane;

	//bi-directional many-to-one association to Hesabruzane
	@OneToMany(mappedBy="hesabmahane")
	private List<Hesabruzane> hesabruzanes;

	public Hesabmahane() {
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

	public Long getKaharj() {
		return this.kaharj;
	}

	public void setKaharj(Long kaharj) {
		this.kaharj = kaharj;
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

	public Hesabsalane getHesabsalane() {
		return this.hesabsalane;
	}

	public void setHesabsalane(Hesabsalane hesabsalane) {
		this.hesabsalane = hesabsalane;
	}

	public List<Hesabruzane> getHesabruzanes() {
		return this.hesabruzanes;
	}

	public void setHesabruzanes(List<Hesabruzane> hesabruzanes) {
		this.hesabruzanes = hesabruzanes;
	}

	public Hesabruzane addHesabruzane(Hesabruzane hesabruzane) {
		getHesabruzanes().add(hesabruzane);
		hesabruzane.setHesabmahane(this);

		return hesabruzane;
	}

	public Hesabruzane removeHesabruzane(Hesabruzane hesabruzane) {
		getHesabruzanes().remove(hesabruzane);
		hesabruzane.setHesabmahane(null);

		return hesabruzane;
	}

}