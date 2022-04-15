package com.SpringFramework.SpringPractice.Sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 BeanwithAnnotaion baw = (BeanwithAnnotaion)context.getBean("anot");
		 System.out.println(baw);

	}

}
