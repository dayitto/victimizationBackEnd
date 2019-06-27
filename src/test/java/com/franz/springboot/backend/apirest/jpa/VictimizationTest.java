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
import com.franz.springboot.backend.apirest.dao.IVictimizationDAO;
import com.franz.springboot.backend.apirest.entity.Victimization;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class VictimizationTest {
	
	@TestConfiguration
	static class VictimizationServiceImplTestContextConfiguration {

		@Bean
		public IVictimizationDAO iVictimizationDAO() {
			return new VictimizationJPA();
		}
	}

	@Autowired
	private IVictimizationDAO iVictimizationDAO;

	@Test
	public void test() {
		List<Victimization> victimizationList = iVictimizationDAO.findByState(1);
		Assertions.assertEquals(8, victimizationList.size(), "Compare number of victimizations");
	}

}
