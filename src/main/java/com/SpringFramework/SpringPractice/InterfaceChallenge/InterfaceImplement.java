package com.SpringFramework.SpringPractice.InterfaceChallenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//@Component
public class InterfaceImplement {
	
	PersonInterface p;
	PersonInterface address;
	public PersonInterface getAddress() {
		return address;
	}
	public void setAddress(PersonInterface address) {
		this.address = address;
	}
	public PersonInterface getP() {
		return p;
	}
//	@Autowired
//	@Qualifier("person")
	public void setP(PersonInterface p) {
		System.out.println("setter");
		this.p = p;
	}

	@Override
	public String toString() {
		return "InterfaceImplement [p=" + p + "]";
	}

	public InterfaceImplement(PersonInterface p) {
		super();
		System.out.println("costurct");
		this.p = p;
	}
	
}
