package javalab;
import java.util.Scanner;
class AgeException extends Exception{
	public AgeException(String message) {
		super(message);
	}
}
public class customex{
	public static void ValidateAge(int age)throws AgeException{
		if(age<18) {
			throw new AgeException("must be 18");
			}
		System.out.println("age is valid"+age);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("voting eligibility");
		System.out.println("enter the age");
		int age=sc.nextInt();
		try {
			ValidateAge(age);
		}catch(AgeException e) {
			System.out.println("error:"+e.getMessage());
			
		}finally {
			System.out.println("finally block.... always present");
		}
	}
}
