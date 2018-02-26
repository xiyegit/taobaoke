package com.taobaoke.dao;

import java.util.List;

import com.taobaoke.beans.TestEntity;

public interface TestDao {
	public void add(TestEntity test);
	public void update(TestEntity test);
	public void delete(int id);
	public TestEntity getTestById(int id);
	public List<TestEntity> getTests();
	public List<TestEntity> getLike(String search);
}
