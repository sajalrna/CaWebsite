package com.sajal.cawebsite.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sajal.cawebsite.model.Associate;

@Transactional
@Repository("associateDAO")
public class AssociateDAOImpl implements AssociateDAO {

	public AssociateDAOImpl() {
	}

	@Autowired
	private SessionFactory sessionFactory;

	Session ss;

	public AssociateDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Associate> associate() {
		ss = sessionFactory.getCurrentSession();
		return ss.createQuery("from Associate").list();
	}

	public boolean save(Associate associate) {
		try {
			ss = sessionFactory.getCurrentSession();
			ss.save(associate);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Associate associate) {
		try {
			ss = sessionFactory.getCurrentSession();
			ss.update(associate);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(int id) {
		try {
			ss = sessionFactory.getCurrentSession();
			ss.delete(getAssociateByID(id));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Associate associate) {
		try {
			ss = sessionFactory.getCurrentSession();
			ss.delete(associate);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Associate getAssociateByID(int id) {
		ss = sessionFactory.getCurrentSession();
		return (Associate) ss.createQuery("from Associate where id = '" + id + "'").uniqueResult();
	}

	public Associate getAssociateByName(String name) {
		ss = sessionFactory.getCurrentSession();
		return (Associate) ss.createQuery("from Associate where name = '" + name + "'").list().get(0);
	}
}
