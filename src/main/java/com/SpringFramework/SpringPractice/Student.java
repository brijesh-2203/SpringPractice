package com.SpringFramework.SpringPractice;

import java.util.*;

public class Student {
	private int rollno;
	private String name;
	private int std;
	private List<Integer> marks;
	private HashMap<Integer, String> subjects;
	public HashMap<Integer, String> getSubjects() {
		return subjects;
	}
	public void setSubjects(HashMap<Integer, String> subjects) {
		this.subjects = subjects;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public Student(int rollno, String name, int std) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.std = std;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", std=" + std + ", marks=" + marks + ", subjects="
				+ subjects + "]";
	}
	

}
