package com.APIsAnnotation;

import java.util.Date;

public class LaunchDate {
	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt);
		
		System.out.println("********************************");
		//for sql database
		long timeInMs = dt.getTime();
		java.sql.Date dt1 = new java.sql.Date(timeInMs);
		System.out.println(dt1);
	}
}
