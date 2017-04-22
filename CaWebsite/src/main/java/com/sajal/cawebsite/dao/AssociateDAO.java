package com.sajal.cawebsite.dao;

import java.util.List;

import com.sajal.cawebsite.model.Associate;

public interface AssociateDAO {

	public List<Associate> associate();

	public boolean save(Associate associate);

	public boolean update(Associate associate);

	public boolean delete(int id);

	public boolean delete(Associate associate);

	public Associate getAssociateByID(int id);

	public Associate getAssociateByName(String name);
}
