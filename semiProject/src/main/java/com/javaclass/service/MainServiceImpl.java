package com.javaclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaclass.dao.MainDAO;
import com.javaclass.domain.CustomerVO;

@Service("mainService")
public class MainServiceImpl implements MainService{
	@Autowired
	private MainDAO mainDao;

	@Override
	public CustomerVO login(CustomerVO vo) throws Exception {
		
		return mainDao.login(vo);
	}

	@Override
	public void signUp(CustomerVO vo) {
		mainDao.signUp(vo);
		
	}

	@Override
	public CustomerVO idCheck(CustomerVO vo) {
		return mainDao.idCheck(vo);
	}
	
	
}
