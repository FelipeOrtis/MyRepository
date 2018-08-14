package com.coinMex.architecture.mx.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coinMex.architecture.mx.vo.PerfilesVO;


@Component

public interface PerfilesServies {
	
	public List<PerfilesVO> getPerfiles();
	
	public List<PerfilesVO> insertPerfil(PerfilesVO requestPerfil);
}
