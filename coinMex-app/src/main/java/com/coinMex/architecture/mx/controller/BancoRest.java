package com.coinMex.architecture.mx.controller;

import java.util.List;

import com.coinMex.architecture.mx.vo.BancoVO;
import com.coinMex.architecture.mx.vo.ResponseVO;

public interface BancoRest {
	
	public List<BancoVO> getBanco();
	
	public List<BancoVO> insertBanco(BancoVO rst);
	
	public ResponseVO updateBanco(BancoVO rst);
	
	public ResponseVO deleteBanco(Long id_banc);
	

}
