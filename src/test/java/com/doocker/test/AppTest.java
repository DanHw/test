package com.doocker.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.doocker.crm.mapper.DeptMapper;
import com.doocker.crm.po.Dept;

public class AppTest {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext app=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		DeptMapper mapper=(DeptMapper)app.getBean("deptMapper");
		Dept selectByPrimaryKey=mapper.selectByPrimaryKey(1);
		System.out.println(selectByPrimaryKey);
	}
	
}
