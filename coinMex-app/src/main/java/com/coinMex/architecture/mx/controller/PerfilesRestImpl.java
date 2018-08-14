package com.coinMex.architecture.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coinMex.architecture.mx.services.PerfilesServies;
import com.coinMex.architecture.mx.vo.PerfilesVO;


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
	
	@RequestMapping(path = "/insertPerfil",method = RequestMethod.POST)
	
	public List<PerfilesVO> insertPerfiles(@RequestBody PerfilesVO requestPerfil){
		return perfilServices.insertPerfil(requestPerfil);
	}
	
}
