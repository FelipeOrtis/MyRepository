package com.coinMex.architecture.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.coinMex.architecture.mx.vo.EstadoVO;
import com.coinMex.architecture.mx.vo.ResponseVO;
import com.coinMex.architecture.mx.services.EstadoService;

@RestController
@RequestMapping(path="/api/v1")
public class EstadoRestImpl implements EstadoRest{
	
	@Autowired
	EstadoService estadoService;
	
	@Override
	@RequestMapping(path="/getEstado", method = RequestMethod.GET)
	public List<EstadoVO> getEstado(){
		return estadoService.getEstado();
	}
	
	@Override
	@RequestMapping(path="/insertEstado", method = RequestMethod.POST)
	public List<EstadoVO> insertEstado(@RequestBody EstadoVO requestEst){
		return estadoService.InsertEstado(requestEst);
				
	}

	@Override
	@RequestMapping(path = "/UpdateEstado", method = RequestMethod.PATCH)
	public ResponseVO updateEstado(@RequestBody EstadoVO rqstEst) {
		return estadoService.UpdateEstado(rqstEst);
	}

	@Override
	@RequestMapping(path = "/DeleteEstado/{id_est}", method = RequestMethod.DELETE)
	public ResponseVO deleteEstado(@PathVariable Long id_est) {
		// TODO Auto-generated method stub
		return estadoService.deleteEstado(id_est);
	} 
}
