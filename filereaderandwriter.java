package javalab;
import java.util.*;
import java.io.*;
public class filereaderandwriter {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			File obj1=new File("register1.txt");
			obj1.createNewFile();
			System.out.println("register1.txt created\n");
			FileWriter fout=new FileWriter("register1.txt");
			System.out.println("enter keam rank number:");
			int n =sc.nextInt();
			fout.write(n+"\n");
			fout.close();
			System.out.println("data added");
			FileReader fin=new FileReader ("register1.txt");
			BufferedReader br=new BufferedReader(fin);
			String str;
			System.out.println("the contents of file");
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
			br.close();
			sc.close();
		}catch(IOException e) {
			System.out.println("error has occured"+e.getMessage());
			
				
		}
		
	} 

}
