package com.franz.springboot.backend.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franz.springboot.backend.apirest.dao.IStateDAO;
import com.franz.springboot.backend.apirest.entity.State;

@Service
public class StateServiceImpl implements IStateService {
	
	@Autowired
	IStateDAO stateDAO;

	@Override
	public List<State> findAll() {
		return stateDAO.findAll();
	}

}
