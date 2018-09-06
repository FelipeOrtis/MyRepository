package com.coinMex.architecture.mx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class EstadoDO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_est")
	private Long id_est;

	@Column(name = "desc_est")
	private String desc_est;

	public String getDesc_est() {
		return desc_est;
	}

	public void setDesc_est(String desc_est) {
		this.desc_est = desc_est;
	}

	public Long getId_est() {
		return id_est;
	}

	public void setId_est(Long id_est) {
		this.id_est = id_est;
	}

}
