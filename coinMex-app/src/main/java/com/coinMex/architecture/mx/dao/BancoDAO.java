package com.coinMex.architecture.mx.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coinMex.architecture.mx.model.BancoDO;

public interface BancoDAO extends JpaRepository<BancoDO, Long>{
	
}
