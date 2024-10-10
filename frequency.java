package javalab;
import java.util.Scanner;
public class frequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		System.out.println("enter a character to find frequency");
		char ch=sc.nextLine().charAt(0);
		int count=0;
		int len=str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i)==ch)
			{
				count++;
			}
			
		}
		System.out.println("the frequecy is"+count);
		
		
		
		
	}
	

}
