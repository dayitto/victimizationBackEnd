package com.franz.springboot.backend.apirest.dao;

import java.util.List;

import com.franz.springboot.backend.apirest.entity.State;

public interface IStateDAO {
	
	public List<State> findAll();

}
