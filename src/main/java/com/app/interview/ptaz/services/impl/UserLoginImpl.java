package com.app.interview.ptaz.services.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import com.app.interview.ptaz.model.UserLogin;
import com.app.interview.ptaz.repo.UserLoginRepo;
import com.app.interview.ptaz.services.UserLoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserLoginImpl implements UserLoginService{
	
	@Autowired UserLoginRepo userLoginRepo;
	@Autowired	private EntityManager em;

	@Override
	public List findAllData() {
		return (List) userLoginRepo.findAll();
	}

	@Override
	public UserLogin saveData(UserLogin gate) {
		UserLogin obj = userLoginRepo.save(gate);	
		return obj;
	}

	@Override
	public UserLogin updateData(UserLogin gate) {		
		UserLogin obj = em.find(UserLogin.class,gate.id_seq); 
		if(obj != null) {
			obj = gate;
			em.merge(obj);
		}
		return obj;
	}

	@Override
	public UserLogin deleteData(UserLogin gate) {
		UserLogin obj = em.find(UserLogin.class,gate.id_seq); 
		if(obj != null) {
			em.remove(obj);
		}
		return obj;
	}

	@Override
	public Boolean deleteDataApi(UserLogin gate) {
		UserLogin obj = em.find(UserLogin.class,gate.id_seq); 
		if(obj != null) {
			em.remove(obj);
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public UserLogin updateDataApi(UserLogin gate) {
		UserLogin obj = em.find(UserLogin.class,gate.id_seq); 
		if(obj != null) {
			obj = gate;
			em.merge(obj);
		}
		return obj;
	}

}
