package org.asena.agans.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tagato database table.
 * 
 */
@Entity
@NamedQuery(name="Tagato.findAll", query="SELECT t FROM Tagato t")
public class Tagato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String name;

	//bi-directional many-to-one association to Rah
	@OneToMany(mappedBy="tagato1")
	private List<Rah> rahs1;

	//bi-directional many-to-one association to Rah
	@OneToMany(mappedBy="tagato2")
	private List<Rah> rahs2;

	//bi-directional many-to-one association to City
	@ManyToOne
	@JoinColumn(name="cityid")
	private City city;

	//bi-directional many-to-one association to Tagatotype
	@ManyToOne
	@JoinColumn(name="tagatotypeid")
	private Tagatotype tagatotype;

	public Tagato() {
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

	public List<Rah> getRahs1() {
		return this.rahs1;
	}

	public void setRahs1(List<Rah> rahs1) {
		this.rahs1 = rahs1;
	}

	public Rah addRahs1(Rah rahs1) {
		getRahs1().add(rahs1);
		rahs1.setTagato1(this);

		return rahs1;
	}

	public Rah removeRahs1(Rah rahs1) {
		getRahs1().remove(rahs1);
		rahs1.setTagato1(null);

		return rahs1;
	}

	public List<Rah> getRahs2() {
		return this.rahs2;
	}

	public void setRahs2(List<Rah> rahs2) {
		this.rahs2 = rahs2;
	}

	public Rah addRahs2(Rah rahs2) {
		getRahs2().add(rahs2);
		rahs2.setTagato2(this);

		return rahs2;
	}

	public Rah removeRahs2(Rah rahs2) {
		getRahs2().remove(rahs2);
		rahs2.setTagato2(null);

		return rahs2;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Tagatotype getTagatotype() {
		return this.tagatotype;
	}

	public void setTagatotype(Tagatotype tagatotype) {
		this.tagatotype = tagatotype;
	}

}