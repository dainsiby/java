package javalab;
import java.util.Scanner;
interface human1{
	void learn(String trainarea);
	void work();
	final int jobid= 1050;
}
interface recruitment1{
	void screening(int score);
}
class programmer1 implements human1,recruitment1{
	public void learn(String trainarea){
		System.out.println("My trained area= "+trainarea);
}
	public void screening(int score) {
		System.out.println("Test score= "+score);
	}
	public void work() {
		System.out.println("Selected to Role development");
		System.out.println("My Job id is = "+jobid);
	}
}
public class interfaccce{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int score;
		String trainarea;
	System.out.println("Enter the trained area: ");
	trainarea=sc.next();
	System.out.println("Enter the test score: ");
	score= sc.nextInt();
	System.out.println("\n**ABOUT MY PLACEMENT**\n");
	programmer1 p= new programmer1();
	p.learn(trainarea);
	p.screening(score);
	p.work();
 }
}