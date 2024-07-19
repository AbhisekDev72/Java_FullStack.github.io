package com.ComparableCompartor;

import java.util.*;

class Student{
	int marks;
	int age;
	String name;
	public Student(int marks,int age,String name) {
		this.marks=marks;
		this.age=age;
		this.name=name;
	}
	public int getmarks(){
		return marks;
	}
	public int getage(){
		return age;
	}
	public String getname(){
		return name;
	}
	public String toString(){
		return ""+ marks + "-" + age + "-" +name;
	}
}
class Alpha implements Comparator<Student>{
	@Override
	public int compare(Student a, Student b) {
		if(a.marks>b.marks)
			return 1;
		else
			return -1;
	}
}
public class ComparatorStud {

	public static void main(String[] args) {
		Student s1 = new Student(45, 18, "Rohan");
		Student s2 = new Student(46, 17, "Rohit");
		Student s3 = new Student(44, 19, "Mehu");
		List<Student> l = new ArrayList ();
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		System.out.println(l);
		System.out.println("**************************************************");
		
		Alpha a1 = new Alpha();
		Collections.sort(l, a1);
		System.out.println(l);
		System.out.println("**************************************************");
		
		//Comparator interface using lambda expression
		Comparator<Student> com = (Student a,Student b) ->{
			if(a.age>b.age)
				return 1;
			else
				return -1;
		};
		Collections.sort(l, com);
		System.out.println(l);
	}

}
