package com.ComparableCompartor;

/* Write a java program to insert the String and StringBuffer object into TreeSet
where Sorting order is in increasing length order.
if 2 objects have same length then consider there alphabetical order
input :: StringBuffer :: A,ABC,AA, String:: XX,ABCD,A
output :: A,AA,XX,ABC,ABCD
hint :: Use Comparator interface,take the help of compareTo() and also convert the
objects into String and use String class
*/

import java.util.*;

class MyComparator2 implements Comparator{
	
	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int i1 = s1.length();
		int i2 = s2.length();
		
		if(i1<i2)
			return -1;
		else if(i1>i2)
			return +1;
		else
			return s1.compareTo(s2);
	}
}
public class ComparatorStrLength {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet (new MyComparator2());
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("ABC"));
		ts.add(new StringBuffer("AA"));
		ts.add("XX");
		ts.add("ABCD");
		ts.add("A");
		
		System.out.println(ts);
	}
}
