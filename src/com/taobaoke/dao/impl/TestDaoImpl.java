package com.taobaoke.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.taobaoke.beans.TestEntity;
import com.taobaoke.dao.TestDao;

public class TestDaoImpl implements TestDao {
	public SessionFactory sessionFactory;
	@Override
	public void add(TestEntity test) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(test);
	}

	@Override
	public void update(TestEntity test) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public TestEntity getTestById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TestEntity> getTests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TestEntity> getLike(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
