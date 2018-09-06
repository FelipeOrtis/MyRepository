package com.coinMex.architecture.mx.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name = "perfiles")

public class PerfilesDO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_perfil")
	private int id_perfil;

	@Column(name = "perfil")
	private String perfil;
	
	@OneToMany
	@JoinColumn(name = "id_perfil")
	List<UsuariosDO> perfiles;

	public int getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public List<UsuariosDO> getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(List<UsuariosDO> perfiles) {
		this.perfiles = perfiles;
	}

	
}
