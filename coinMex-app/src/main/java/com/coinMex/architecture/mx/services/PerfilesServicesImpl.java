package com.coinMex.architecture.mx.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coinMex.architecture.mx.dao.PerfilesDAO;
import com.coinMex.architecture.mx.model.PerfilesDO;
import com.coinMex.architecture.mx.vo.PerfilesVO;
import com.coinMex.architecture.mx.vo.ResponseVO;

@Service

public class PerfilesServicesImpl implements PerfilesServies {
	
	
	@Autowired
     PerfilesDAO perfilDAO;
	
	@Override
	public List<PerfilesVO> getPerfiles() {
		List<PerfilesDO> listPerfiles = perfilDAO.findAll();
		
		return listPerfiles.stream().map(x -> new PerfilesVO() {{
			setId_perfil(x.getId_perfil());
			setPerfil(x.getPerfil());
			
		}}).collect(Collectors.toList());
		
	}

	@Override
	public List<PerfilesVO> insertPerfil(PerfilesVO requestPerfil) {
		// TODO Auto-generated method stub
		PerfilesDO dat = new PerfilesDO();
		ResponseVO response = new ResponseVO();
		
		/*String validaId= String.valueOf(requestPerfil.getId_perfil());
		if (validaId.equals(null)) {
			response.setDetail("Success");
			response.setTypeDetail("Success");
			*/
			dat.setPerfil(requestPerfil.getPerfil());
			
			perfilDAO.save(dat);			
		/*}else {
			response.setDetail("Fail");
			response.setTypeDetail("Fail");
		}*/
					
			List<PerfilesDO> listPerfil= perfilDAO.findAll();
			
			return listPerfil.stream().map(x -> new PerfilesVO() {
				{
					setId_perfil(x.getId_perfil());
					setPerfil(x.getPerfil());
				}
			}).collect(Collectors.toList());
		 
	}
	
	
}

	