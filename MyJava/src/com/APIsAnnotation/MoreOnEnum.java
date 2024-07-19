package com.APIsAnnotation;

enum Result {
	PASS , FAIL , NR;
	//backside in package
//	public static PASS = new Result();
//	public static FAIL = new Result();
//	public static NR = new Result();
//	i.e why  3 time constructor was called
	
	Result(){
		System.out.println("Constructor of enum");
	}
	int marks;
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
}
public class MoreOnEnum {

	public static void main(String[] args) {
		Result.PASS.setMarks(50);
		int m = Result.PASS.getMarks();
		System.out.println(m);
		
		int m1 = Result.FAIL.getMarks();
		System.out.println(m1);
	}

}
