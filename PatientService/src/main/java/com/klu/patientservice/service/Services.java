package com.klu.patientservice.service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Service;
import com.klu.patientservice.Entity.Patient;

@Service
public class Services {
	private final AtomicInteger nextId = new AtomicInteger(1);
	private final List<Patient> patients = new CopyOnWriteArrayList<>();

	public Patient createPatient(Patient patient) {
		if (patient.getId() == 0) {
			patient.setId(nextId.getAndIncrement());
		}
		patients.add(patient);
		return patient;
	}

	public Iterable<Patient> getPatients() {
		return patients;
	}
}
