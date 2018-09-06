package com.coinMex.architecture.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coinMex.architecture.mx.services.BancoService;
import com.coinMex.architecture.mx.vo.BancoVO;
import com.coinMex.architecture.mx.vo.ResponseVO;

@RestController
@RequestMapping(path = "/api/v1")
public class BancoRestImpl implements BancoRest {
	
	@Autowired
	BancoService bancoService;

	@Override
	@RequestMapping(path = "/GetBanco", method = RequestMethod.GET)
	public List<BancoVO> getBanco() {
		// TODO Auto-generated method stub
		return bancoService.getBanco();
	}

	@Override
	@RequestMapping(path = "/InsertBanco", method = RequestMethod.POST)
	public List<BancoVO> insertBanco(@RequestBody BancoVO rqs) {
		// TODO Auto-generated method stub
		return bancoService.insertBanco(rqs);
	}

	@Override
	@RequestMapping(path = "/UpdateBanco", method = RequestMethod.PATCH)
	public ResponseVO updateBanco(@RequestBody BancoVO rst) {
		// TODO Auto-generated method stub
		return bancoService.updateBanco(rst);
	}

	@Override
	@RequestMapping(path = "/DeleteBanco/{id_banc}", method = RequestMethod.DELETE)
	public ResponseVO deleteBanco(Long id_banc) {
		// TODO Auto-generated method stub
		return bancoService.deleteBanco(id_banc);
	}

}
