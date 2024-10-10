package javalab;
import java.util.Scanner;
public class exception {
	public static void main(String args[]) {
			Scanner sc=new Scanner (System.in);
			int ch;
			do {
			System.out.println("choose an option");
			System.out.println("1 arithymetic exception");
			System.out.println("2. array out of bounds exception");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				try {  System.out.println("enter a numerator");
			        int numerator=sc.nextInt();
			        System.out.println("enter a denominator");
			        int denominator=sc.nextInt();
			        int ans=numerator/denominator;
			        System.out.println("the quotient is"+ans);
			       }
			catch(ArithmeticException e) {
				System.out.println("caught an exception-"+e.getMessage());
		}
				break;
			case 2:
				int a[]= {1,2,3};
				try { System.out.println("enter an index to print");
				int in=sc.nextInt();
				System.out.println("element at index"+in+" = "+a[in]);
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("caught an exception-"+e.getMessage());
					
					}
				break;
				default:
					System.out.println("enter a valid choice 1 or 2");
					break;
					
				
			}
			System.out.println("do you want to continue?(y/n)");                    
			ch=sc.next().charAt(0);	
			}
			while(ch=='y');
			
			}
}