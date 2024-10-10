package javalab;
import java.util.Scanner;
class Calc{
	void area(double base,double height) {
		double triangleresult=(base*height)/2;
		System.out.println("the area of a triangle is "+triangleresult);
	}
	void area(int length,int breadth) {
		int rectangleresult=(length*breadth)/2;
		System.out.println("the area of a rectangle is"+rectangleresult);
	}
	void area(double radius) {
		double circleresult=(3.14*radius*radius);
		System.out.println("the area of circle is"+circleresult);
	}
}
public class methodoverloading{
	public static void main(String[] args) {
		java.util.Scanner sc=new Scanner(System.in);
		Calc p=new Calc();
		System.out.println("enter the base and height of the triangle");
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		p.area(base,height);
		System.out.println("enter the width and length of the rectangle");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		p.area(length,breadth);
		System.out.println("enter the radius of circle");
		double r=sc.nextDouble();
		p.area(r);
		
	}

}
