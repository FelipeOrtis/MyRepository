package com.coinMex.architecture.mx.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coinMex.architecture.mx.model.PerfilesDO;
import com.coinMex.architecture.mx.vo.PerfilesVO;

@Repository

public interface PerfilesDAO extends JpaRepository<PerfilesDO, Long>{

}
