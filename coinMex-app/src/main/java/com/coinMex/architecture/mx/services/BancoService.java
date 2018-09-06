package com.coinMex.architecture.mx.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coinMex.architecture.mx.vo.BancoVO;
import com.coinMex.architecture.mx.vo.ResponseVO;

@Component
public interface BancoService {
	
	public List<BancoVO> getBanco();

	public List<BancoVO> insertBanco(BancoVO rqst);
	
	public ResponseVO updateBanco(BancoVO rqstVO);
	
	public ResponseVO deleteBanco(Long id_banco);
}
