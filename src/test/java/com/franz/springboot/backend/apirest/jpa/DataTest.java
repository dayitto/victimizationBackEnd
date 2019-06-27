package com.franz.springboot.backend.apirest.jpa;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import com.franz.springboot.backend.apirest.dao.IVictimizationDAO;
import com.franz.springboot.backend.apirest.entity.State;
import com.franz.springboot.backend.apirest.entity.Victimization;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class DataTest {

	@TestConfiguration
	static class VictimizationServiceImplTestContextConfiguration {

		@Bean
		public IVictimizationDAO iVictimizationDAO() {
			return new VictimizationJPA();
		}
	}

	private Victimization victimization;

	@Autowired
	private IVictimizationDAO iVictimizationDAO;

	@Before
	public void setUp() {
		victimization = new Victimization();
		victimization.setId(1);
		victimization.setYear(2010);
		victimization.setRateAll(23993);
		victimization.setRateMen(26682);
		victimization.setRateWomen(21548);
		State state = new State();
		state.setId((long) 1);
		state.setName("All States");
		victimization.setState(state);
	}

	@Test
	public void test() {
		List<Victimization> victimizationList = iVictimizationDAO.findByState(1);
		Assertions.assertEquals(victimization, victimizationList.get(0), "Compare data of victimization of All States of the 2010 year");
	}

}
