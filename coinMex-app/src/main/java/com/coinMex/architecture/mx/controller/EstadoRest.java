package com.coinMex.architecture.mx.controller;

import java.util.List;

import com.coinMex.architecture.mx.vo.EstadoVO;
import com.coinMex.architecture.mx.vo.ResponseVO;

public interface EstadoRest {
	
	public  List<EstadoVO> getEstado();

	public List<EstadoVO> insertEstado(EstadoVO requestEst);
	
	public ResponseVO updateEstado(EstadoVO rqstEst);
	
	public ResponseVO deleteEstado(Long id_est);
		

}
