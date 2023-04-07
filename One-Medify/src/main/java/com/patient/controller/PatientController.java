package com.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patient.patientdetails.Patient;
import com.patient.services.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientService patientService;

	@PostMapping("/add")
	public String add(@RequestBody Patient patient) {
		return patientService.add(patient);
		
	}
	
	@GetMapping("/viewall")
	public List<Patient> getAll(){
		return patientService.getAll();
		
	}
}
