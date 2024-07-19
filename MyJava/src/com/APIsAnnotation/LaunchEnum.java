package com.APIsAnnotation;

import java.util.Iterator;

enum Week{
	MON , TUE , WED , THUR ,FRI ,SAT;
}
public class LaunchEnum {
	enum Result{
		PASS , FAIL , NORESULT;
	}
	public static void main(String[] args) {
		Week w = Week.MON; 
		System.out.println(w);
		
		int index = Week.MON.ordinal();
		System.out.println(index);
		
		Week[] wr = Week.values();
		for(Week w1 : wr){
			System.out.println(w1 + " " + w1.ordinal());
		} 
		
//		Result r = Result.PASS;
//		System.out.println(r);
	}
}
