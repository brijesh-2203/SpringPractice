package com.SpringFramework.SpringPractice.ConstructorInjection;

import java.util.List;

import com.SpringFramework.SpringPractice.ReferenceType.B;

public class Person{
	private int id;
	private String fname;
	private String lname;
	private String salary;
	private B obj;
	private List<String> days;
	public List<String> getDays() {
		return days;
	}
	public void setDays(List<String> days) {
		this.days = days;
	}
	public Person(int id, String fname, String lname,B obj,List<String> days) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.obj = obj;
		this.days = days;
	}
	public Person(int id, String fname, String lname,B obj,List<String> days,String salary) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.obj = obj;
		this.days = days;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Id : " + id + " Firstname : " + fname + " Lastname : " + lname + "{ B-Class :" + obj+" }   Days :{ "+days+"}  Salary: "+salary;
	}
	public String toString1() {
		return "Id : " + id + " Firstname : " + fname + " Lastname : " + lname + "{ B-Class :" + obj+" }   Days :{ "+days+"}  Salary: "+salary;
	}
}
