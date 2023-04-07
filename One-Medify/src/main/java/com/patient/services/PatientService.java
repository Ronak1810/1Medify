package com.patient.services;

import java.util.List;

import com.patient.patientdetails.Patient;

public interface PatientService {

	String add (Patient patient);
	
	List<Patient> getAll();
}
