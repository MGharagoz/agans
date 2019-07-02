package org.asena.agans.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the city database table.
 * 
 */
@Entity
@NamedQuery(name="City.findAll", query="SELECT c FROM City c")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String name;

	//bi-directional many-to-one association to Ostan
	@ManyToOne
	@JoinColumn(name="ostanid")
	private Ostan ostan;

	//bi-directional many-to-one association to Tagato
	@OneToMany(mappedBy="city")
	private List<Tagato> tagatos;

	public City() {
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

	public Ostan getOstan() {
		return this.ostan;
	}

	public void setOstan(Ostan ostan) {
		this.ostan = ostan;
	}

	public List<Tagato> getTagatos() {
		return this.tagatos;
	}

	public void setTagatos(List<Tagato> tagatos) {
		this.tagatos = tagatos;
	}

	public Tagato addTagato(Tagato tagato) {
		getTagatos().add(tagato);
		tagato.setCity(this);

		return tagato;
	}

	public Tagato removeTagato(Tagato tagato) {
		getTagatos().remove(tagato);
		tagato.setCity(null);

		return tagato;
	}

}