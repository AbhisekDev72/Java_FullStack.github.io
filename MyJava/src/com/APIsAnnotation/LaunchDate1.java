package com.APIsAnnotation;

import java.time.*;

public class LaunchDate1 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		System.out.println(day +"/"+ month +"/"+ year);
		
		System.out.println("****************************");
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int nano = time.getNano();
		System.out.println("The time is now : " +hour+":"+min+":"+sec+":"+nano);
	}
}
 