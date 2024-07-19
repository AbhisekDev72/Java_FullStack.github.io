package com.ComparableCompartor;

/*Write a program to Insert Employee Object into TreeSet where
a. DNSO is based on Ascending order of Employee Id
b. Customzied Sorting order is based on Alphabetical order of there names 

Employee
name : String
id : int
*/

import java.util.*;

//Implementing Customize Sorting Order Or Using of Comparator Interface
class MyComparator3 implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;
		
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
}


// Implementing Default Natural Sorting Order Or Using of Comparable Interface
class Employee implements Comparable{
	String name;
	int eid;
	public Employee(String name,int eid) {
		this.name =name;
		this.eid = eid;
	}
	@Override
	public String toString() {
		return name + "-------------->" + eid;
	}
	@Override
//  new Employee("dravid",19).compareTo(new Employee("sachin",10))
	public int compareTo(Object obj) {
		int eid1 = this.eid;
		Employee e =(Employee)obj;
		int eid2 = e.eid;
		if (eid1<eid2)
			return -1;
		else if (eid1>eid2)
			return 1;
		else
			return 0;
			
	}
	
}
public class SortingEmp {
	public static void main(String[] args) {
		
		System.out.println("***********DNSO USING EID*****************");
		
		TreeSet ts = new TreeSet();
		
		ts.add(new Employee("sachin",10));
		ts.add(new Employee("dravid",19));
		ts.add(new Employee("kohli",18));
		ts.add(new Employee("dhoni",7));
		ts.add(new Employee("lara",9));
		ts.add(new Employee("lara",9));
		
		System.out.println(ts);
		System.out.println();
		System.out.println("***********NSO USING ENAME*****************");

		TreeSet ts1 = new TreeSet(new MyComparator3());
		
		ts1.add(new Employee("sachin",10));
		ts1.add(new Employee("dravid",19));
		ts1.add(new Employee("kohli",18));
		ts1.add(new Employee("dhoni",7));
		ts1.add(new Employee("lara",9));
		ts1.add(new Employee("lara",9));
		
		System.out.println(ts1);
	}
}
