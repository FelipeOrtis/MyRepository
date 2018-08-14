package com.coinMex.architecture.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coinMex.architecture.mx.services.PerfilesServies;
import com.coinMex.architecture.mx.services.UsuariosServices;
import com.coinMex.architecture.mx.vo.ClassEntrada;
import com.coinMex.architecture.mx.vo.ClassSalida;
import com.coinMex.architecture.mx.vo.Ejem1;
import com.coinMex.architecture.mx.vo.PerfilesVO;
import com.coinMex.architecture.mx.vo.ResponseVO;
import com.coinMex.architecture.mx.vo.UsuariosVO;

@RestController
@RequestMapping(path="api/v1")
public class UsuariosRestImpl implements UsuariosRest {
	
	@Autowired
	UsuariosServices usuariosServices;

	@Override
	@RequestMapping(path = "/getUsers", method = RequestMethod.GET)
	
	
	public List<UsuariosVO> getUsers() {
		return usuariosServices.getUsers();
	
	}
	
	@RequestMapping(path = "/getData", method = RequestMethod.POST)
	public String ejemplo(@RequestBody Ejem1 xx) {
		return xx.getVar()+"holo";
	}
	
	@RequestMapping(path = "/getUser", method = RequestMethod.POST)
	public ClassSalida ejemp2(@RequestBody ClassEntrada requestData) {
		return usuariosServices.ejemp2(requestData);
	}
	
	@RequestMapping(path= "/insertUser", method =RequestMethod.POST)
		public List<UsuariosVO> insert(@RequestBody UsuariosVO request) {
		return 	usuariosServices.insertUser(request);
	}
	
	@RequestMapping(path= "/updateRow", method = RequestMethod.PATCH)	
	public ResponseVO update(@RequestBody UsuariosVO reqst){
	return usuariosServices.updateRow(reqst);
			
	}
	
	@RequestMapping(path="/deleteField/{idUser}", method = RequestMethod.DELETE)
	public ResponseVO delete(@PathVariable Long idUser) {
		return usuariosServices.deleteField(idUser);
	}

	
	
}
