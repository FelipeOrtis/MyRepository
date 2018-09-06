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
		
			dat.setPerfil(requestPerfil.getPerfil());
			
			perfilDAO.save(dat);			
					
			List<PerfilesDO> listPerfil= perfilDAO.findAll();
			
			return listPerfil.stream().map(x -> new PerfilesVO() {
				{
					setId_perfil(x.getId_perfil());
					setPerfil(x.getPerfil());
				}
			}).collect(Collectors.toList());
		 
	}

	@Override
	public ResponseVO updatePerfil(PerfilesVO rqstPerfil) {
		// TODO Auto-generated method stub
		PerfilesDO per= new PerfilesDO();
		ResponseVO resp = new ResponseVO();
		
		per.setId_perfil(rqstPerfil.getId_perfil());
		per.setPerfil(rqstPerfil.getPerfil());
		
		resp.setDetail("SUCCESS");
		resp.setTypeDetail("SUCCESS");
		try {
			perfilDAO.save(per);
		}catch(Exception e) {
			resp.setDetail("FAIL");
			resp.setTypeDetail("FAIL"+e.getMessage());
		}		
		return resp;
	}

	@Override
	public ResponseVO deletePerfil(Long id_per) {
		// TODO Auto-generated method stub
		ResponseVO res = new ResponseVO();
		res.setDetail("SUCCESS");
		res.setTypeDetail("SUCCESS");
		try{
			perfilDAO.delete(id_per);
		}catch(Exception e){
			res.setDetail("FAIL");
			res.setTypeDetail("FAIL"+e.getMessage());
		}
		return res;
	}
	
	
}

	