package com.ComparableCompartor;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator1 implements Comparator{
	
	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = (String)obj1;
		String s2 = (String)obj2;
//	or  String s2 = obj2.toString();
		
		return s2.compareTo(s1);
	}
	
}
public class ComparatorPlayer {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet (new MyComparator1());
		ts.add("sachin");
		ts.add("saurav");
		ts.add("dravid");
		ts.add("dhoni");
		ts.add("viru");
		System.out.println(ts);
	}

}
