package com.SpringFramework.SpringPractice.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringFramework/SpringPractice/LifeCycle/lifecycle.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/SpringFramework/SpringPractice/LifeCycle/lifecycle.xml");
		//Jalebi j1 = (Jalebi) context.getBean("j1");
		
		//context.close();    //this will call destroy method at this time and destroy all beans in bean factory
		//System.out.println(j1);
		context.registerShutdownHook();  //this will inform the jvm to destroy the object after work of object is done
		Jalebi j2 = (Jalebi) context.getBean("j2");
		System.out.println(j2);
	}
}
