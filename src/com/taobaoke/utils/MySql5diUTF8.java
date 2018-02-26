package com.taobaoke.utils;

import org.hibernate.dialect.MySQL5Dialect;

/**
 *�̳�hibernate����,��չhibernate��Ĺ���
 *���hibernate�����������������������.
 * @author 123
 */
public class MySql5diUTF8 extends MySQL5Dialect{

	@Override
	public String getTableTypeString() {
		// TODO Auto-generated method stub
		return " ENGINE=InnoDB DEFAULT CHARSET=utf8"; 
	}
	
	
}