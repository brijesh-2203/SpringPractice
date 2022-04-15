package com.SpringFramework.SpringPractice.Challenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		SetinList li = (SetinList) context.getBean("set");
		System.out.println(li);
		System.out.println("List inside set: "+li.getNumber());
		System.out.println("----------------------------------------------------------------------");
		SetinList lii = (SetinList) context.getBean("set1");
		System.out.println(lii);
		System.out.println("List inside List inside set: "+lii.getNumber());
	}

}
