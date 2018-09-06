package com.coinMex.architecture.mx.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "banco")
public class BancoDO implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_banco")
	private Long id_banco;

	@Column(name = "num_cuenta")
	private Long num_cuenta;
	
	@Column(name = "saldo")
	private Long saldo;

	@Column(name = "id_estado")
	private Long id_estado;
	
	@OneToMany
	@JoinColumn(name = "num_cuenta", referencedColumnName = "num_cuenta")
	List<UsuariosDO> perfiles;

	public Long getId_banco() {
		return id_banco;
	}

	public void setId_banco(Long id_banco) {
		this.id_banco = id_banco;
	}

	public Long getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(Long num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public List<UsuariosDO> getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(List<UsuariosDO> perfiles) {
		this.perfiles = perfiles;
	}

	public Long getSaldo() {
		return saldo;
	}

	public void setSaldo(Long saldo) {
		this.saldo = saldo;
	}

	public Long getId_estado() {
		return id_estado;
	}

	public void setId_estado(Long id_estado) {
		this.id_estado = id_estado;
	}
}
