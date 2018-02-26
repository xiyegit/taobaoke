package com.taobaoke.Controller;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.taobaoke.beans.TestEntity;
import com.taobaoke.service.TestService;

public class TestAction extends ActionSupport {
	private TestService testService;
	private TestEntity test;
	private List<TestEntity> tests;
	
	
	public String add(){
		testService.add(test);
		return "success";
	}


	public TestService getTestService() {
		return testService;
	}


	public void setTestService(TestService testService) {
		this.testService = testService;
	}


	public TestEntity getTest() {
		return test;
	}


	public void setTest(TestEntity test) {
		this.test = test;
	}


	public List<TestEntity> getTests() {
		return tests;
	}


	public void setTests(List<TestEntity> tests) {
		this.tests = tests;
	}

}
