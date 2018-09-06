package com.coinMex.architecture.mx.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coinMex.architecture.mx.dao.BancoDAO;
import com.coinMex.architecture.mx.model.BancoDO;
import com.coinMex.architecture.mx.vo.BancoVO;
import com.coinMex.architecture.mx.vo.ResponseVO;


@Service
public class BancoServiceImpl implements BancoService {

	@Autowired
	BancoDAO bancoDAO;
	
	@Override
	public List<BancoVO> getBanco() {
		// TODO Auto-generated method stub
		
		List<BancoDO> list = bancoDAO.findAll();
		
		return list.stream().map(x -> new BancoVO() {
			{
			setId_banco(x.getId_banco());
			setNum_cuenta(x.getNum_cuenta());
			setSaldo(x.getSaldo());
			setId_estado(x.getId_estado());
			}
			}).collect(Collectors.toList());	
	}

	@Override
	public List<BancoVO> insertBanco(BancoVO rqst) {
		// TODO Auto-generated method stub
		BancoDO ban = new BancoDO();
		ban.setId_estado(rqst.getId_estado());
		ban.setSaldo(rqst.getSaldo());
		ban.setNum_cuenta(rqst.getNum_cuenta());
		
		bancoDAO.save(ban);
		List<BancoDO> listInsrt = bancoDAO.findAll();
		return listInsrt.stream().map(x -> new BancoVO() {
			{
			setId_banco(x.getId_banco());
			setId_estado(x.getId_estado());
			setNum_cuenta(x.getNum_cuenta());
			setSaldo(x.getSaldo());
			}
			}).collect(Collectors.toList());
	}

	@Override
	public ResponseVO updateBanco(BancoVO rqstVO) {
		// TODO Auto-generated method stub
		BancoDO banUpdt = new BancoDO();
		ResponseVO re = new ResponseVO();
		
		banUpdt.setId_banco(rqstVO.getId_banco());
		banUpdt.setId_estado(rqstVO.getId_estado());
		banUpdt.setNum_cuenta(rqstVO.getNum_cuenta());
		banUpdt.setSaldo(rqstVO.getSaldo());
		
		re.setDetail("SUCCESS");
		re.setTypeDetail("SUCCESS");
		
		
		try {
			bancoDAO.save(banUpdt);
		}catch(Exception e) {
			re.setDetail("FAIL");
			re.setTypeDetail("FAIl"+e.getMessage());
		}
		
		return re;
	}

	@Override
	public ResponseVO deleteBanco(Long id_banco) {
		// TODO Auto-generated method stub
		ResponseVO res = new ResponseVO();
		
		res.setDetail("SUCCESS");
		res.setTypeDetail("SUCCESS");
		
		try {
			bancoDAO.delete(id_banco);
		}catch(Exception e){
			res.setDetail("FAIL");
			res.setTypeDetail("FAIL"+e.getMessage());
		}
		
		
		return res;
	}

	
}
