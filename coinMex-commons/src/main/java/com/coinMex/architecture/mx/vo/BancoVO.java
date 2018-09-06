package com.coinMex.architecture.mx.vo;

public class BancoVO {

	private Long id_banco;
	private Long num_cuenta;
	private Long saldo;
	private Long id_estado;

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
