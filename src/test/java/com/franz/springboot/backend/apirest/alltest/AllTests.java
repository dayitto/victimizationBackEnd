package com.franz.springboot.backend.apirest.alltest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.franz.springboot.backend.apirest.jpa.DataTest;
import com.franz.springboot.backend.apirest.jpa.StateTest;
import com.franz.springboot.backend.apirest.jpa.VictimizationTest;
import com.franz.springboot.backend.apirest.rest.StateRestTest;
import com.franz.springboot.backend.apirest.rest.VictimizationRestTest;

@RunWith(Suite.class)
@SuiteClasses({StateRestTest.class, VictimizationRestTest.class, DataTest.class, StateTest.class, VictimizationTest.class})
public class AllTests {

}
