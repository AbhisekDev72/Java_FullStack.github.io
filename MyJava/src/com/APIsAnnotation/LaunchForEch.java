package com.APIsAnnotation;

import java.util.Arrays;
import java.util.*;
import java.util.function.*;

public class LaunchForEch {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(8);
		list.add(9);
		System.out.println(list);
		
		List<Integer> list1 = Arrays.asList(2,4,5,8,9);
//		for (Integer num:list1) {
//			System.out.println(num);
//		}
//	or	for (Object o:list1) {
//			System.out.println(o);
//		}
		
		//Consumer is a func interface 
//		Consumer<Integer> cons = new Consumer<Integer>()
//		{
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		}; 
//		Consumer<Integer> cons = t-> System.out.println(t);
		list1.forEach(t->System.out.println(t));
	}
}
