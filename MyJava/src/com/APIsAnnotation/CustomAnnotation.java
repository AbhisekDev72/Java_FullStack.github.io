package com.APIsAnnotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// For custom annotation we need to create an interface of the name of the annotation
//@Target(ElementType.TYPE) 

//by using bellow target we can use our custm annotn for any type of element
@Target({ElementType.TYPE ,ElementType.METHOD,ElementType.FIELD})

// This(custm annotn) should be affect till the run time
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{
	String country() default "India";
	// mention like above otherwise pass the value in the annotation as parameter
	//int age();
	int age() default 34;
}
//@CricketPlayer(age = 25)
@CricketPlayer
class Virat{
	@CricketPlayer
	private int innings;
	private int runs;
	
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
}

public class CustomAnnotation {

	public static void main(String[] args) {
		Virat v = new Virat();
		v.setInnings(300);
		v.setRuns(20000);
		System.out.println(v.getInnings());
		System.out.println(v.getRuns());
		
		//Retrieving using Reflection API
		Class c = v.getClass();
		Annotation a = c.getAnnotation(CricketPlayer.class);
		CricketPlayer cp = (CricketPlayer)a;
		System.out.println(cp.age());
		System.out.println(cp.country());
	}
}
