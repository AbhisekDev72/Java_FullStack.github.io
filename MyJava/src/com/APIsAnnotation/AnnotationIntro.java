package com.APIsAnnotation;

class Plane{
	public void fly() {
		System.out.println("Plane is flying");
	}
}
class CargoPlane extends Plane{
	@Override
	public void fly() {
		System.out.println("CargoPlane is flying");
	}
}
public class AnnotationIntro {

	public static void main(String[] args) {
		Plane cp = new CargoPlane();
		cp.fly();
	}

}
