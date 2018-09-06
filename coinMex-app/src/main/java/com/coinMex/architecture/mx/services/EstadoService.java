package com.coinMex.architecture.mx.services;

import java.util.List;

import org.springframework.stereotype.Component;
import com.coinMex.architecture.mx.vo.EstadoVO;
import com.coinMex.architecture.mx.vo.ResponseVO;

@Component
public interface EstadoService {
	
	public List<EstadoVO> getEstado();
	
	public List<EstadoVO> InsertEstado(EstadoVO requestEst);
	
	public ResponseVO UpdateEstado(EstadoVO rqstEet);
	
	public ResponseVO deleteEstado(Long id_est);

}
