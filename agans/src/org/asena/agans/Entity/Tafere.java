package org.asena.agans.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tafere database table.
 * 
 */
@Entity
@NamedQuery(name="Tafere.findAll", query="SELECT t FROM Tafere t")
public class Tafere implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private Long megdar;

	//bi-directional many-to-one association to Rah
	@OneToMany(mappedBy="tafere")
	private List<Rah> rahs;

	public Tafere() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMegdar() {
		return this.megdar;
	}

	public void setMegdar(Long megdar) {
		this.megdar = megdar;
	}

	public List<Rah> getRahs() {
		return this.rahs;
	}

	public void setRahs(List<Rah> rahs) {
		this.rahs = rahs;
	}

	public Rah addRah(Rah rah) {
		getRahs().add(rah);
		rah.setTafere(this);

		return rah;
	}

	public Rah removeRah(Rah rah) {
		getRahs().remove(rah);
		rah.setTafere(null);

		return rah;
	}

}