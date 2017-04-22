package com.sajal.cawebsite.dao;

import java.util.List;

import com.sajal.cawebsite.model.Service;

public interface ServiceDAO {

	public List<Service> service();

	public boolean save(Service service);

	public boolean update(Service service);

	public boolean delete(int id);

	public boolean delete(Service service);

	public Service getServiceByID(int id);

	public Service getServiceByName(String name);

}
