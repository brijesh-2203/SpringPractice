package com.SpringFramework.SpringPractice.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInj {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringFramework/SpringPractice/ConstructorInjection/ciconfig.xml");
		Person p = (Person)context.getBean("person");
		System.out.println(p);
		Person p1 = (Person)context.getBean("person1");
		System.out.println(p1);
		Person p2 = (Person)context.getBean("person2");
		System.out.println(p2);
	}
}
