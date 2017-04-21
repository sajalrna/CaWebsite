package com.sajal.cawebsite.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Associates implements Serializable {

	@Id
	private int id;

	private String name;

	private String company;

	private String companyname;

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

}
