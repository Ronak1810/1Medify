package com.patient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.patient.patientdetails.Patient;
import com.patient.repository.PatientRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public String add(@RequestBody Patient patient) {
		patientRepository.save(patient);
		return "Your Details added Successfully...";
		
	}

	@Override
	public List<Patient> getAll() {
		return patientRepository.findAll();
		}

}
