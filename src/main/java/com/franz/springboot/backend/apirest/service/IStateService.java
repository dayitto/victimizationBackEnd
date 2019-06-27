package com.franz.springboot.backend.apirest.service;

import java.util.List;

import com.franz.springboot.backend.apirest.entity.State;

public interface IStateService {
	public List<State> findAll();
}
