package com.franz.springboot.backend.apirest.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.franz.springboot.backend.apirest.entity.State;
import com.franz.springboot.backend.apirest.service.IStateService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class StateController {
	
	@Autowired
	private IStateService stateService;
	
	@GetMapping("/states")
	public ResponseEntity<List<State>> getAll() {
		return ResponseEntity.ok(stateService.findAll());
	}

}
