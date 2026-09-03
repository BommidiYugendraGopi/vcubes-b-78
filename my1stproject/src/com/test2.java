package com;

public class test2 {
	static test2 t = new test2();
	static {
		System.out.println("static block 1 called");
	}
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		
		//static block vs main method
		System.out.println("main method started");
	}
	static {
		System.out.println("static block 2 called");
	}
	{
		System.out.println("hello2");
	}
}
