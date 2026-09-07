package com.pu.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
// import jakarta.persistence.Temporal;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "myseq")
	@SequenceGenerator(name = "myseq", initialValue = 101, allocationSize = 10)
	
	private int roll;
	@Column(name = "studentName", length = 200, nullable = false)
	private String name;
	private String city;
//	@Temporal(TemporalType.DATE)
//	private LocalDate dob;
	
	public Student() {
		super();
	}
	
	public Student( String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
