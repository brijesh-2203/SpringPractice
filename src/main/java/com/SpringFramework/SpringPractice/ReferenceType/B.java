package com.SpringFramework.SpringPractice.ReferenceType;

public class B {

	private int a;
	private String ans;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getAns() {
		return ans;
	}
	@Override
	public String toString() {
		return "B [a=" + a + ", ans=" + ans + "]";
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
}
