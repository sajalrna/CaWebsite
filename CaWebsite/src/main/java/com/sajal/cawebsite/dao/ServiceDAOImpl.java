package com.sajal.cawebsite.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sajal.cawebsite.model.Service;

@Transactional
@Repository("serviceDAO")
public class ServiceDAOImpl implements ServiceDAO {

	public ServiceDAOImpl() {
	}

	@Autowired
	private SessionFactory sessionFactory;

	Session ss;

	public ServiceDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Service> service() {
		ss = sessionFactory.getCurrentSession();
		return ss.createQuery("from Service").list();
	}

	public boolean save(Service service) {
		try {
			ss = sessionFactory.getCurrentSession();
			ss.save(service);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Service service) {
		try {
			ss = sessionFactory.getCurrentSession();
			ss.update(service);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(int id) {
		try {
			ss = sessionFactory.getCurrentSession();
			ss.delete(getServiceByID(id));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Service service) {
		try {
			ss = sessionFactory.getCurrentSession();
			ss.delete(service);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Service getServiceByID(int id) {
		ss = sessionFactory.getCurrentSession();
		return (Service) ss.createQuery("from Service where id = '" + id + "'").uniqueResult();
	}

	public Service getServiceByName(String name) {
		ss = sessionFactory.getCurrentSession();
		return (Service) ss.createQuery("from Service where name = '" + name + "'").list().get(0);
	}

}
