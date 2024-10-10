package javalab;
import java.io.File;
import java.io.IOException;
public class Createfile{
	public static void main(String[] args) {
		try {
			File myobj=new File("Dain.txt");
			if(myobj.createNewFile()) {
				System.out.println("file created:"+myobj.getName());
				
			}
			else {
				System.out.println("file exista already");
			}
		}catch(IOException e) {
			System.out.println("an error occured.");
			e.printStackTrace();
		}
	}
}

