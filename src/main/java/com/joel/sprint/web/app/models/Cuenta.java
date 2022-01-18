package com.joel.sprint.web.app.models;

import javax.persistence.*;
 
@Entity
@Table(name = "cuenta")
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "descripcion")
	private String descripcion;

	public Cuenta() {

	}

	public Cuenta(long id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "cuenta [id=" + id + ", descripcion=" + descripcion + "]";
	}

}
