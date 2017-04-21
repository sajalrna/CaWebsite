package com.sajal.cawebsite.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sajal.cawebsite.model.Authorize;
import com.sajal.cawebsite.model.User;

@Transactional
@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	public UserDAOImpl() {
	}

	@Autowired
	private SessionFactory sessionFactory;

	Session session;

	public UserDAOImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}

	public boolean save(User user) {
		try {
			session = sessionFactory.getCurrentSession();
			Authorize auth = new Authorize();
			user.setId(user.getUsername());
			user.setEnabled(true);
			auth.setId(user.getId());
			auth.setRole("ROLE_USER");
			session.save(user);
			session.save(auth);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean validate(String username, String password) {
		session = sessionFactory.getCurrentSession();
		String hql = "from User where username='" + username + "' and password='" + password + "'";
		if (session.createQuery(hql).uniqueResult() != null) {
			return true;
		}
		return false;
	}

}
