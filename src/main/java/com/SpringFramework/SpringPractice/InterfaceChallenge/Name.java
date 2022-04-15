package com.SpringFramework.SpringPractice.InterfaceChallenge;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="person")
public class Name implements PersonInterface{
	
	public Name() {
		super();
		System.out.println("Default snsns");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Name [number=" + number + ", name=" + name + "]";
	}
	
	//@Value("10")
	private int number;
	//@Value("Brijesh")
	private String name;
		public Name(int number, String name) {
		super();
		this.number = number;
		this.name = name;
		System.out.println("constructor Name");
	}
		public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		System.out.println("Setter number");
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("settername");
		this.name = name;
	}
		public void message()
		{
			System.out.println("Time management");
		}
		public void greet()
		{
			System.out.println("Good");
		}
	
}
