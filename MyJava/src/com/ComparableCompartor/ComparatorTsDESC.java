package com.ComparableCompartor;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
//		if(i1>i2)
//			return -1;
//		else if(i1<i2)
//			return 1;
//		else
//			return 0;
//		return i1.compareTo(i2);//ascending order
		return -i1.compareTo(i2);//descending order
//		return i2.compareTo(i1);//descending order
//		return 1;//insertion order preserved
//		return -1;//reverse of insertion order preserved
//		return 0;//only 1st element will be added
	}
	
}
public class ComparatorTsDESC {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet (new MyComparator());
		ts.add(10);
		ts.add(0);
		ts.add(5);
		ts.add(15);
		ts.add(20);
		ts.add(20);
		System.out.println(ts);
		
	}
}
