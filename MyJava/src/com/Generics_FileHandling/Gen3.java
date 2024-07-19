package com.Generics_FileHandling;
import java.util.*;

class Gen <T>{
	T obj;
	public Gen(T obj) {
		this.obj = obj;
	}
	void disp() {
		System.out.println("The type of data is : " + obj.getClass().getName());
	}
	public T getobj() {
		return obj;
	}
}
public class Gen3 {

	public static void main(String[] args) {
		Gen <Integer> g = new Gen(10);
		g.disp();
		System.out.println(g.getobj());
		
		System.out.println("*******************************************");
		
		Gen <String> g1 = new Gen<String>("AB");
		g1.disp();
		System.out.println(g1.getobj());
	}

}
