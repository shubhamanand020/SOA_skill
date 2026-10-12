package com.klu.patientservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.klu.patientservice.service.Services;
import com.klu.patientservice.Entity.Patient;

@RestController
@RequestMapping("/patient")
public class Controller {
	private final Services serv;

	public Controller(Services serv) {
		this.serv = serv;
	}

	@PostMapping
	public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
		return ResponseEntity.ok(serv.createPatient(patient));
	}

	@GetMapping
	public ResponseEntity<Iterable<Patient>> getPatients() {
		return ResponseEntity.ok(serv.getPatients());
	}
}
