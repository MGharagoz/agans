package org.asena.agans.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the rahtype database table.
 * 
 */
@Entity
@NamedQuery(name="Rahtype.findAll", query="SELECT r FROM Rahtype r")
public class Rahtype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String name;

	//bi-directional many-to-one association to Rah
	@OneToMany(mappedBy="rahtype")
	private List<Rah> rahs;

	public Rahtype() {
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

	public List<Rah> getRahs() {
		return this.rahs;
	}

	public void setRahs(List<Rah> rahs) {
		this.rahs = rahs;
	}

	public Rah addRah(Rah rah) {
		getRahs().add(rah);
		rah.setRahtype(this);

		return rah;
	}

	public Rah removeRah(Rah rah) {
		getRahs().remove(rah);
		rah.setRahtype(null);

		return rah;
	}

}