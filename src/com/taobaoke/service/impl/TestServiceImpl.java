package com.taobaoke.service.impl;

import java.util.List;

import com.taobaoke.beans.TestEntity;
import com.taobaoke.dao.TestDao;
import com.taobaoke.service.TestService;

public class TestServiceImpl implements TestService {
	private TestDao testDao;
	@Override
	public void add(TestEntity test) {
		// TODO Auto-generated method stub
		testDao.add(test);
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

	public TestDao getTestDao() {
		return testDao;
	}

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

}
