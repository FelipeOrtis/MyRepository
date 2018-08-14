package com.coinMex.architecture.mx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name="id_perfil")
	private int id_perfil;
	
	@Column(name="num_cuenta")
	private int num_acount;
	
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

	public int getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}

	public int getNum_acount() {
		return num_acount;
	}

	public void setNum_acount(int num_acount) {
		this.num_acount = num_acount;
	}
	
	
	

}
