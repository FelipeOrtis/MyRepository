package com.coinMex.architecture.mx.vo;

public class UsuariosVO {
	
	private Long id_user;
	
	private String name;
	
	private String user;
	
	private String password;
	
	private String newPass;
	
	private String email;
	
	private int id_perfil;
	
	private int num_acount;
	
	private int edad;
	
	private String campo;
	
	

	
	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
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
	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
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
