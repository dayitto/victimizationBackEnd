package com.franz.springboot.backend.apirest.rest;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import io.restassured.RestAssured;

public class StateRestTest {

	@Test
	public void test() {
		RestAssured.get("http://localhost:8190/api/states").then().assertThat()
		.body("size()", is(33));
	}

}
