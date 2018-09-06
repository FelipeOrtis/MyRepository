package com.coinMex.architecture.mx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UsuariosDO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Long id_user;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="usuario")
	private String user;
	
	@Column(name="pass")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil")
	private PerfilesDO perfil;
	
	@ManyToOne
	@JoinColumn(name = "num_cuenta", referencedColumnName = "num_cuenta")
	private BancoDO banco;
	
	
	
	public Long getId() {
		return this.id_user;
	}

	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PerfilesDO getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilesDO perfil) {
		this.perfil = perfil;
	}

	public BancoDO getNum_acount() {
		return banco;
	}

	public void setNum_acount(BancoDO banco) {
		this.banco = banco;
	}
	
	
	

}
