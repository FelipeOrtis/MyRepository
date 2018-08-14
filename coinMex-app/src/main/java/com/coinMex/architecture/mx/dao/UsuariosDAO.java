package com.coinMex.architecture.mx.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coinMex.architecture.mx.model.UsuariosDO;

@Repository
public interface UsuariosDAO extends JpaRepository<UsuariosDO, Long> {

}
