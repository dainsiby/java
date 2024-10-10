package javalab;
import java.util.Scanner;
class employee{
	double salary,gross_sal,da,hra;
	employee(double salary,double da,double hra){
		this.salary=salary;
		this.da=da;
		this.hra=hra;
	}
	void display() {
		System.out.println("*** employee***\n");
	}
	void calcsalary() {
		gross_sal=salary+salary*(da/100)+salary*(hra/100);
		System.out.println("the gross salary is"+gross_sal);
	}
}
	class engineer extends employee{
		engineer(double salary,double da,double hra)
		{
			super(salary,da,hra);
			}
		void display() {
			super.display();
			super.calcsalary();
			System.out.println("*** engineer***\n");
	}
		void calcsalary() {
			System.out.println("the gross salary is"+gross_sal*2);
		}
	}
	public class methodoverriding{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the salary of employee");
			double salary=sc.nextDouble();
			System.out.println("enter the da% of employee");
			double da=sc.nextDouble();
			System.out.println("enter the hra% of the employee");
			double hra=sc.nextDouble();
			engineer job=new engineer(salary,da,hra);
					job.display();
			job.calcsalary();
		}
	}
	
	
