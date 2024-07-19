package com.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(100);
			al.add(150);
			al.add(25);
			al.add(74);
			al.add(125);
			System.out.println(al);
			Collections.sort(al);
			System.out.println(al);
			System.out.println("**********************************");
			ArrayList<String> al1 = new ArrayList<String>();
			al1.add("Abhisek");
			al1.add("PW");
			al1.add("Java");
			al1.add("Rohan");
			al1.add("Manas");
			System.out.println(al1);
			Collections.sort(al1);
			System.out.println(al1);
	}

}
