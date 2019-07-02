package org.asena.agans.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tagatotype database table.
 * 
 */
@Entity
@NamedQuery(name="Tagatotype.findAll", query="SELECT t FROM Tagatotype t")
public class Tagatotype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String name;

	//bi-directional many-to-one association to Tagato
	@OneToMany(mappedBy="tagatotype")
	private List<Tagato> tagatos;

	public Tagatotype() {
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

	public List<Tagato> getTagatos() {
		return this.tagatos;
	}

	public void setTagatos(List<Tagato> tagatos) {
		this.tagatos = tagatos;
	}

	public Tagato addTagato(Tagato tagato) {
		getTagatos().add(tagato);
		tagato.setTagatotype(this);

		return tagato;
	}

	public Tagato removeTagato(Tagato tagato) {
		getTagatos().remove(tagato);
		tagato.setTagatotype(null);

		return tagato;
	}

}