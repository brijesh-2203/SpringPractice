package com.SpringFramework.SpringPractice.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringFramework.SpringPractice.Student;

public class AutowiringTest {
	public static void main(String[] args) {
		 @SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringFramework/SpringPractice/AutoWiring/autowire.xml");
//	        Employee e1 = (Employee) context.getBean("emp1");
//	        System.out.println(e1);
//	        Employee e2 = (Employee) context.getBean("emp2");
//	        System.out.println(e2);
//	        Employee e3 = (Employee) context.getBean("emp3");
//	        System.out.println(e3);
//	        Employee e4 = (Employee) context.getBean("emp4");
//	        System.out.println(e4);
//	        System.out.println(e4.getNumber());
//	        System.out.println(e4.getNumber().getClass().getName());   //here i have used util schema for using list ,arraylist,linkedlist
//	        Employee e5 = (Employee) context.getBean("emp5");
//	        System.out.println(e5);
//	        System.out.println(e5.getNumber());
//	        System.out.println(e5.getNumber().getClass().getName());
	        Employee e6 = (Employee) context.getBean("emp6");
	        System.out.println(e6);
	        System.out.println(e6.getNumber());
	        System.out.println(e6.getNumber().getClass().getName());
	        System.out.println(e6.getWork());
	        System.out.println(e6.getWork().getClass().getName());
	}
}
