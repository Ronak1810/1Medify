package com.patient.patientdetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient_Details")

public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nameOfThePatient;
	private char gender;
	private String email;
	private String password;
	private String mobileNumber;
	private int age;
	private int weight;
	private String disease;
	
	public String getNameOfThePatient() {
		return nameOfThePatient;
	}
	public void setNameOfThePatient(String nameOfThePatient) {
		this.nameOfThePatient = nameOfThePatient;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Patient(String nameOfThePatient, char gender, String email, String password, String mobileNumber,
			int age, int weight, String disease) {
		super();
		this.nameOfThePatient = nameOfThePatient;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.weight = weight;
		this.disease = disease;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
