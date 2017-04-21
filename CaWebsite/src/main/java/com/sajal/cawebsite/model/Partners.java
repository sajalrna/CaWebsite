package com.sajal.cawebsite.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Partners implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	private String name;

	private String about;

	private double year;

	private String role;

	private String expertise;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

}
