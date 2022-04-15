package com.SpringFramework.SpringPractice.InterfaceChallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InterfaceTest {
	public static void main(String[] args) {
		 @SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 InterfaceImplement i1 = (InterfaceImplement) context.getBean("impl");
		 System.out.println(i1);
			i1.getP().greet();
			i1.getP().message();
			i1.getAddress().greet();
	}
}
