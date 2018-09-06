package com.coinMex.architecture.mx.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coinMex.architecture.mx.vo.PerfilesVO;
import com.coinMex.architecture.mx.vo.ResponseVO;


@Component

public interface PerfilesServies {
	
	public List<PerfilesVO> getPerfiles();
	
	public List<PerfilesVO> insertPerfil(PerfilesVO requestPerfil);
	
	public ResponseVO updatePerfil (PerfilesVO rqstPerfil);
	
	public ResponseVO deletePerfil(Long id_per);
}
