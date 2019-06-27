package com.franz.springboot.backend.apirest.service;

import java.util.List;

import com.franz.springboot.backend.apirest.entity.Victimization;

public interface IVictimizationService {
	public List<Victimization> findAll();

	public List<Victimization> findByState(long idState);

}
