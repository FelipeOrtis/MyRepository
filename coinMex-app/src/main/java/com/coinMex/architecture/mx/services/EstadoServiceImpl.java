package com.coinMex.architecture.mx.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coinMex.architecture.mx.dao.EstadoDAO;
import com.coinMex.architecture.mx.model.EstadoDO;
import com.coinMex.architecture.mx.vo.EstadoVO;
import com.coinMex.architecture.mx.vo.ResponseVO;

@Service
public class EstadoServiceImpl implements EstadoService{

	@Autowired
	EstadoDAO estadoDAO;
	
	@Override
	public List<EstadoVO> getEstado() {
		List<EstadoDO> listEstado= estadoDAO.findAll();
		// TODO Auto-generated method stub
		return listEstado.stream().map(x -> new EstadoVO() {
			{
				setId_est(x.getId_est());
				setDes_Est(x.getDesc_est());
			}
		}).collect(Collectors.toList());
	}

	@Override
	public List<EstadoVO> InsertEstado(EstadoVO requestEst) {

		EstadoDO est = new EstadoDO();
		
		est.setDesc_est(requestEst.getDes_Est());
		
		estadoDAO.save(est);
		
		List<EstadoDO> listEst = estadoDAO.findAll();
		// TODO Auto-generated method stub
		return listEst.stream().map(x -> new EstadoVO() {
			{
				setId_est(x.getId_est());
				setDes_Est(x.getDesc_est());
			}
			}).collect(Collectors.toList());
	}

	@Override
	public ResponseVO UpdateEstado(EstadoVO rqstEet) {
		// TODO Auto-generated method stub
		
		EstadoDO est = new EstadoDO();
		ResponseVO res = new ResponseVO();
		
		est.setId_est(rqstEet.getId_est());
		est.setDesc_est(rqstEet.getDes_Est());
		
		res.setDetail("SUCCESS");
		res.setTypeDetail("SUCCESS");;
		
		try {
			estadoDAO.save(est);
		}catch(Exception e){
			res.setDetail("FAIL");
			res.setTypeDetail("FAIL"+e.getMessage());
		}
		
		
		return res;
	}

	@Override
	public ResponseVO deleteEstado(Long id_est) {
		// TODO Auto-generated method stub
		ResponseVO re = new ResponseVO();
		
		re.setDetail("SUCCESS");
		re.setDetail("SUCCESS");
		
		try {
			estadoDAO.delete(id_est);	
		}catch(Exception e){
			re.setDetail("FAIL");
			re.setTypeDetail("FAIL"+e.getMessage());
		}
		
		return re;
	}

}
