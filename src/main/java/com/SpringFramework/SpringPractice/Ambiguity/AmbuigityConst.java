package com.SpringFramework.SpringPractice.Ambiguity;

public class AmbuigityConst {
	private int a;
	private int b;
	private int c;
	public AmbuigityConst(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("int constr");
	}
	public AmbuigityConst(float a, float b) {
		this.a =  (int)a;
		this.b = (int) b;
		System.out.println("float constr");
	}
	public AmbuigityConst(double a, double b) {
		this.a =  (int)a;
		this.b = (int) b;
		System.out.println("double constr");
	}
	public AmbuigityConst(long a, long b) {
		this.a =  (int)a;
		this.b = (int) b;
		System.out.println("long constr");
	}
	public AmbuigityConst(int a, int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("int constr three args");
	}

	/*
	 * public AmbuigityConst(String a, String b) { this.a = Integer.parseInt(a);
	 * this.b = Integer.parseInt(b); System.out.println("string constr"); }
	 */
	void add()
	{
		System.out.println("Sum is :"+(this.a+this.b));
	}
	void add3()
	{
		System.out.println("Sum is :"+(this.a+this.b+this.c));
	}
}
