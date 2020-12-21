package com.lti;

public class Calc {
	
	public static int add(int n1,int n2) {
		return n1+n2;
	}
	public static int subs(int n1,int n2) {
		return n1-n2;
	}
	public static int multiply(int n1,int n2) {
		return n1*n2;
	}
	public static int divide(int n1,int n2) {
		return n1/n2;
	}
	
	public static void main(String args[]) {
		System.out.println("add "+add(10,20));
		System.out.println("subs "+subs(10,20));
		System.out.println("production "+multiply(10,20));
		System.out.println("quotient "+divide(10,20));
	}
}
