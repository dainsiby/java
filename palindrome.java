package javalab;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
	int flag=0;
	int len=str.length();
	for(int i=0;i<len/2;i++)
	{
		if(str.charAt(i)!=str.charAt(len-i-1))
		{
			flag=1;
			break;
		}
		}
	if (flag==1)
		System.out.println("not a palindrome");
		else
			System.out.println("it is a palindrome");
	}
}


