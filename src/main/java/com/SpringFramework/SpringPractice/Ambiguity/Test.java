package com.SpringFramework.SpringPractice.Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		AmbuigityConst am = (AmbuigityConst) context.getBean("add");
		am.add();
		am.add3();
	}

}
