package com.franz.springboot.backend.apirest.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.franz.springboot.backend.apirest.dao.IStateDAO;
import com.franz.springboot.backend.apirest.entity.State;

@Repository
public class StateJPA implements IStateDAO{
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<State> findAll() {
		return em.createQuery("from State").getResultList();
	}

}
