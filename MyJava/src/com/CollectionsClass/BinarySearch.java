package com.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(20);
		System.out.println(al);
		int index = Collections.binarySearch(al, 30);
		System.out.println(index);
		int index1 = Collections.binarySearch(al, 60);
		System.out.println(index1);
		
		System.out.println("****************************");
		
		Collections.rotate(al, 3);
		System.out.println(al);

		System.out.println("****************************");
		
		Collections.shuffle(al);
		System.out.println(al);

		System.out.println("****************************");
		
		System.out.println(Collections.frequency(al, 20));
	}
}
