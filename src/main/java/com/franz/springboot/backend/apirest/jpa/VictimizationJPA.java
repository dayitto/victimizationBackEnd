package com.franz.springboot.backend.apirest.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.franz.springboot.backend.apirest.dao.IVictimizationDAO;
import com.franz.springboot.backend.apirest.entity.Victimization;

@Repository
public class VictimizationJPA implements IVictimizationDAO{
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Victimization> findAll() {
		return em.createQuery("from Victimization").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Victimization> findByState(long idState) {
		return em.createQuery("from Victimization WHERE id_state = :idState Order by year")
				.setParameter("idState", idState)
				.getResultList();
	}

}
