package org.asena.agans.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ostan database table.
 * 
 */
@Entity
@NamedQuery(name="Ostan.findAll", query="SELECT o FROM Ostan o")
public class Ostan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String name;

	//bi-directional many-to-one association to City
	@OneToMany(mappedBy="ostan")
	private List<City> cities;

	public Ostan() {
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

	public List<City> getCities() {
		return this.cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public City addCity(City city) {
		getCities().add(city);
		city.setOstan(this);

		return city;
	}

	public City removeCity(City city) {
		getCities().remove(city);
		city.setOstan(null);

		return city;
	}

}