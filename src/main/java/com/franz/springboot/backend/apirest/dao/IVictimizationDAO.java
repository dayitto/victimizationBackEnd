package com.franz.springboot.backend.apirest.dao;

import java.util.List;
import com.franz.springboot.backend.apirest.entity.Victimization;

public interface IVictimizationDAO {

	public List<Victimization> findAll();
	
	public List<Victimization> findByState(long idState);
}
