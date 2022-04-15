package com.SpringFramework.SpringPractice.AutoWiring;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	//using annotation
	
	private int id;
	private String name;
	
//	@Qualifier("address")
	private Address address;
	private List<Integer> number;
	private Map<String,Integer> work;
	public Map<String, Integer> getWork() {
		return work;
	}
	public void setWork(Map<String, Integer> work) {
		this.work = work;
	}
	public List<Integer> getNumber() {
		return number;
	}
	public void setNumber(List<Integer> number) {
		this.number = number;
	}
//	@Override
//	public String toString() {
//		return "Employee { Id= " + id + ", Name= " + name + ", Address= " + address + " }";
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
//	@Autowired
	public void setAddress(Address address) {
		System.out.println("setter");
		this.address = address;
	}
//	public Employee(int id, String name, Address address) {
//		super();
//		System.out.println("inside constructor");
//		this.id = id;
//		this.name = name;
//		this.address = address;
//	}
//	@Autowired
	public Employee(Address address) {
		super();
		System.out.println("constructor");
		this.address = address;
	}
	public Employee() {
		System.out.println("default");
	}
	@Autowired
	public Employee(int id, String name, Address address, List<Integer> number, Map<String, Integer> work) {
		super();
		System.out.println("const");
		this.id = id;
		this.name = name;
		this.address = address;
		this.number = number;
		this.work = work;
	}
}
