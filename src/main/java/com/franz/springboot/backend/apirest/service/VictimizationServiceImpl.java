package com.franz.springboot.backend.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franz.springboot.backend.apirest.dao.IVictimizationDAO;
import com.franz.springboot.backend.apirest.entity.Victimization;

@Service
public class VictimizationServiceImpl implements IVictimizationService{
	
	@Autowired
	IVictimizationDAO victimizationDAO;

	@Override
	public List<Victimization> findAll() {
		return victimizationDAO.findAll();
	}

	@Override
	public List<Victimization> findByState(long idState){
		return victimizationDAO.findByState(idState);
	}

}
