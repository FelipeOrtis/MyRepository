package com.coinMex.architecture.mx.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coinMex.architecture.mx.vo.ClassEntrada;
import com.coinMex.architecture.mx.vo.ClassSalida;
import com.coinMex.architecture.mx.vo.ResponseVO;
import com.coinMex.architecture.mx.vo.UsuariosVO;

@Component
public interface UsuariosServices {
	
	public List<UsuariosVO> getUsers();
	
	public ClassSalida ejemp2(ClassEntrada requestData);
	
	public List <UsuariosVO> insertUser(UsuariosVO request);
	
	public ResponseVO updateRow(UsuariosVO reqst);
	
	public ResponseVO deleteField(Long idUser);

}
