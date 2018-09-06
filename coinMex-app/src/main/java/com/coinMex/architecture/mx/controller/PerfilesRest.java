package com.coinMex.architecture.mx.controller;

import java.util.List;

import com.coinMex.architecture.mx.vo.PerfilesVO;
import com.coinMex.architecture.mx.vo.ResponseVO;

public interface PerfilesRest {

	public List<PerfilesVO>  getPerfiles();
	
	public List<PerfilesVO> InsertPerfil(PerfilesVO ReqsPer);
	
	public ResponseVO UpdatePerfil(PerfilesVO rqst);
	
	public ResponseVO DletePerfil(Long id_per);
}
