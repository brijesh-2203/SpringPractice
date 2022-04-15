package com.SpringFramework.SpringPractice.ReferenceType;

public class A {
	private int a;
	private String name;
	private B obj;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "A [a=" + a + ", name=" + name + ", obj=" + obj + "]";
	}
}
