package com.SpringFramework.SpringPractice.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Jalebi {
	private double price;
	private String taste;
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Jalebi [price=" + price + ", taste=" + taste + "]";
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	//Here we have created init method and destroy method manually
//	public void init()
//	{
//		System.out.println("Inside Init method");
//	}
//	public void destroy()
//	{
//		System.out.println("Inside Destroy method");
//	}
	
	//here we have override init and destroy from interface
//	public void destroy()
//	{
//		System.out.println("Inside Destroy method of interface");
//	}
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Inside Init method of Interface");
//		
//	}
	@PostConstruct
	public void start()
	{
		System.out.println("Start");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("Ended");
	}
}
