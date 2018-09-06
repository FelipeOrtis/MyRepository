package com.coinMex.architecture.mx.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coinMex.architecture.mx.model.EstadoDO;

@Repository
public interface EstadoDAO extends JpaRepository<EstadoDO, Long>{

}
