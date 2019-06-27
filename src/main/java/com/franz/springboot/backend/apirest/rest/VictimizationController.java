package com.franz.springboot.backend.apirest.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.franz.springboot.backend.apirest.entity.Victimization;
import com.franz.springboot.backend.apirest.service.IVictimizationService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class VictimizationController {

	@Autowired
	private IVictimizationService victimizationService;

	@GetMapping("/victimizations")
	public ResponseEntity<List<Victimization>> findAll() {
		return ResponseEntity.ok(victimizationService.findAll());
	}

	@GetMapping(value = "/victimizations/{idState}")
	public ResponseEntity<List<Victimization>> findByState(@PathVariable("idState") final int idState) {
		return ResponseEntity.ok(victimizationService.findByState(idState));
	}
}
