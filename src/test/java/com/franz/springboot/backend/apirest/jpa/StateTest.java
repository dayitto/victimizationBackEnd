package com.franz.springboot.backend.apirest.jpa;

import java.util.List;

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

import com.franz.springboot.backend.apirest.dao.IStateDAO;
import com.franz.springboot.backend.apirest.entity.State;
import com.franz.springboot.backend.apirest.jpa.StateJPA;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class StateTest {

	@TestConfiguration
	static class StateServiceImplTestContextConfiguration {

		@Bean
		public IStateDAO iStateDAO() {
			return new StateJPA();
		}
	}

	@Autowired
	private IStateDAO iStateDAO;

	@Test
	public void test() {
		List<State> stateList = iStateDAO.findAll();
		Assertions.assertEquals(33, stateList.size(), "Compare number of states");
	}
}
