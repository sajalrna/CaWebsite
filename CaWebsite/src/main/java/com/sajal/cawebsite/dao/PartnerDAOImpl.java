package com.sajal.cawebsite.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sajal.cawebsite.model.Partner;

@Transactional
@Repository("partnerDAO")
public class PartnerDAOImpl implements PartnerDAO {

	public PartnerDAOImpl() {
	}

	@Autowired
	private SessionFactory sessionFactory;

	Session ss;

	public PartnerDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Partner> partner() {
		ss = sessionFactory.getCurrentSession();
		return ss.createQuery("from Partner").list();
	}

	public boolean save(Partner partner) {
		try {
			ss = sessionFactory.getCurrentSession();
			ss.save(partner);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Partner partner) {
		try {
			ss = sessionFactory.getCurrentSession();
			ss.update(partner);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(int id) {
		try {
			ss = sessionFactory.getCurrentSession();
			ss.delete(getPartnerByID(id));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Partner partner) {
		try {
			ss = sessionFactory.getCurrentSession();
			ss.delete(partner);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Partner getPartnerByID(int id) {
		ss = sessionFactory.getCurrentSession();
		return (Partner) ss.createQuery("from Partner where id = '" + id + "'").uniqueResult();
	}

	public Partner getPartnerByName(String name) {
		ss = sessionFactory.getCurrentSession();
		return (Partner) ss.createQuery("from Partner where name = '" + name + "'").list().get(0);
	}

}
