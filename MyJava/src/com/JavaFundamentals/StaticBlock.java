package com.JavaFundamentals;
class A{
	static int a = m1();
	static int m1(){
		System.out.println("A:a");
		return 10;
	}
	static {
		System.out.println("From Static block of class A");
	}
}
public class StaticBlock extends A{
	static int b = m2();
	static int m2(){
		System.out.println("B:a");
		return 20;
	}
	static {
		System.out.println("From Static block of class A");
	}
	public static void main(String[] args) {
		System.out.println("B main");
		System.out.println("B main "+ a);
		System.out.println("B main "+ b);
	}
}
