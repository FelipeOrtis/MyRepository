package com.coinMex.architecture.mx.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coinMex.architecture.mx.dao.UsuariosDAO;
import com.coinMex.architecture.mx.model.BancoDO;
import com.coinMex.architecture.mx.model.PerfilesDO;
import com.coinMex.architecture.mx.model.UsuariosDO;
import com.coinMex.architecture.mx.services.UsuariosServices;
import com.coinMex.architecture.mx.vo.ClassEntrada;
import com.coinMex.architecture.mx.vo.ClassSalida;
import com.coinMex.architecture.mx.vo.ResponseVO;
import com.coinMex.architecture.mx.vo.UsuariosVO;

@Service
public class UsuariosServiceImpl implements UsuariosServices {

	@Autowired
	UsuariosDAO usuariosDAO;

	@Override
	public List<UsuariosVO> getUsers() {
		List<UsuariosDO> listUsers = usuariosDAO.findAll();

		return listUsers.stream().map(x -> new UsuariosVO() {
			{				
				setId_user(x.getId_user());
				setName(x.getName());
				setEmail(x.getEmail());
				setUser(x.getUser());
				setPassword(x.getPassword());
				setId_perfil(x.getPerfil().getId_perfil());
				setNum_acount(x.getNum_acount().getNum_cuenta());
			}
		}).collect(Collectors.toList());

	}

	@Override
	public ClassSalida ejemp2(ClassEntrada requestData) {
		// TODO Auto-generated method stub
		ClassSalida response = new ClassSalida();
		response.setNombre(requestData.getNombre() + requestData.getApePat() + requestData.getApeMat());

		// response.setEdad(requestData.getEdad());
		int ed = requestData.getEdad();
		if (ed > 18) {
			response.setEdad("Eres mayor de edad");
		} else {
			response.setEdad("Menor de edad");
		}

		// response.setSexo(requestData.getSexo());
		String sex = requestData.getSexo();
		// int lng = sex.length();

		if (sex.length() == 1) {
			if (sex.equals("M")) {
				response.setSexo("Masculino");
			} else {
				response.setSexo("Femenino");
			}
		} else {
			response.setSexo("Mas de un caracter");
		}

		// response.setCel(requestData.getTel());
		int tlf = requestData.getTel();

		String cl = String.valueOf(tlf);
		if (cl.length() != 10) {
			response.setCel(0);
		} else {
			response.setCel(tlf);
		}

		response.setDomicilio("el eden");
		return response;
	}

	@Override
	public List<UsuariosVO> insertUser(UsuariosVO request) {
		// TODO Auto-generated method stub
		UsuariosDO data = new UsuariosDO();
		PerfilesDO user = new PerfilesDO();
		BancoDO bDO = new BancoDO();
		
		Boolean validEdad = false;
		Boolean validPass = false;

		bDO.setNum_cuenta(request.getNum_acount());
		user.setId_perfil(request.getId_perfil());
		
		if (request.getEdad() > 18) {
			validEdad = true;
		}
		if (request.getPassword().equals(request.getNewPass())) {
			validPass = true;
		}
		if (validEdad && validPass) {
			data.setName(request.getName());
			data.setUser(request.getUser());
			data.setPassword(request.getNewPass());
			data.setEmail(request.getEmail());
			data.setPerfil(user);
			data.setNum_acount(bDO);

			usuariosDAO.save(data);

		}

		List<UsuariosDO> listUsers = usuariosDAO.findAll();

		return listUsers.stream().map(x -> new UsuariosVO() {
			{
				setId_user(x.getId_user());
				setName(x.getName());
				setEmail(x.getEmail());
				setUser(x.getUser());
				setPassword(x.getPassword());
				setId_perfil(x.getPerfil().getId_perfil());
				setNum_acount(x.getNum_acount().getNum_cuenta());
			}
		}).collect(Collectors.toList());

	}

	@Override
	public ResponseVO updateRow(UsuariosVO reqst) {
		// TODO Auto-generated method stub
		ResponseVO responseVO = new ResponseVO();
		UsuariosDO userDO = new UsuariosDO();
		PerfilesDO perfil = new PerfilesDO();
		BancoDO bn = new BancoDO();
		
		bn.setNum_cuenta(reqst.getNum_acount());
		
		perfil.setId_perfil(reqst.getId_perfil());
		// reqst.getId_user();

		if (reqst.getId_user() != null) {
			userDO.setId_user(reqst.getId_user());
			userDO.setName(reqst.getName());
			userDO.setUser(reqst.getUser());
			userDO.setPassword(reqst.getPassword());
			userDO.setEmail(reqst.getEmail());
			userDO.setPerfil(perfil);
			userDO.setNum_acount(bn);

			responseVO.setDetail("SUCCESS");
			responseVO.setTypeDetail("SUCCELL");

			try {
				usuariosDAO.save(userDO);
			} catch (Exception e) {
				responseVO.setDetail("FAIL");
				responseVO.setTypeDetail(e.getMessage());
			}

		}

		return responseVO;
	}

	@Override
	public ResponseVO deleteField(Long idUser) {
		ResponseVO responsDel = new ResponseVO();

		responsDel.setDetail("SUCCESS");

		try {
			usuariosDAO.delete(idUser);
		} catch (Exception e) {

			responsDel.setDetail("FAIL");
			responsDel.setTypeDetail(e.getMessage());

		}
		return (responsDel);

	}

}
