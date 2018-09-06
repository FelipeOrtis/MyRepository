package com.coinMex.architecture.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coinMex.architecture.mx.services.PerfilesServies;
import com.coinMex.architecture.mx.vo.PerfilesVO;
import com.coinMex.architecture.mx.vo.ResponseVO;


@RestController
@RequestMapping(path="api/v1")


public class PerfilesRestImpl implements PerfilesRest{

	@Autowired
	PerfilesServies perfilServices;
	
	@Override
	@RequestMapping(path = "/getPerfiles", method = RequestMethod.GET)
	
	public List<PerfilesVO> getPerfiles() {
		// TODO Auto-generated method stub
		return perfilServices.getPerfiles();
	}
	

	@Override
	@RequestMapping(path = "/insertPerfil",method = RequestMethod.POST)
	public List<PerfilesVO> InsertPerfil(@RequestBody PerfilesVO requestPerfil){
		// TODO Auto-generated method stub
		return perfilServices.insertPerfil(requestPerfil);
	}


	@Override
	@RequestMapping(path = "/UpdatePerfil", method = RequestMethod.PATCH)
	public ResponseVO UpdatePerfil(@RequestBody PerfilesVO rqst) {
		// TODO Auto-generated method stub
		return perfilServices.updatePerfil(rqst);
	}


	@Override
	@RequestMapping(path = "/DeletePerfil/{id_per}", method = RequestMethod.DELETE)
	public ResponseVO DletePerfil(@PathVariable Long id_per) {
		// TODO Auto-generated method stub
		return perfilServices.deletePerfil(id_per);
	}
		
}
