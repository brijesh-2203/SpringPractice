package com.SpringFramework.SpringPractice.ReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceInjection {
	public static void main( String[] args )
    {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringFramework/SpringPractice/ReferenceType/refconfig.xml");
		A object = (A) context.getBean("aref");
        System.out.println(object);
        System.out.println(object.getObj());
        System.out.println(object.getObj().getA());
    }
}
