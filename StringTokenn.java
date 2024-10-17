package javalab;
import java.util.*;
public class StringTokenn{
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the line of integer");
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens()) {
			String a =st.nextToken();
				int n=Integer.parseInt(a);
				System.out.println(n+"\n");
					sum+=n;
		}
		System.out.println("the total sum="+sum);
		sc.close();
		
		
		
	}
	
}
