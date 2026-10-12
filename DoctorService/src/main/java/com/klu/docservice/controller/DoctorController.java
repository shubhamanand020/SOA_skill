package com.klu.docservice.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.klu.docservice.entity.Doctor;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@GetMapping
	public ResponseEntity<List<Doctor>> getDoctors() {
		Doctor doctor = new Doctor();
		doctor.setId(1);
		doctor.setDocname("Dr. Smith");
		doctor.setRole("Cardiologist");
		return ResponseEntity.ok(List.of(doctor));
	}
}
