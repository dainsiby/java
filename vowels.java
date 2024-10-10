package javalab;
import java.util.Scanner;


public class vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str= sc.nextLine();
		int count=0;
		int len=str.length();
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			if(ch='a'//ch='e'//ch='i'//ch='o'//ch='u')
			if(str.charAt(i)== vowel[i]) {
				count++;
			}
			
		}
		System.out.println("number of vowels ="+count);
	}

}
