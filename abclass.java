package javalab;
abstract class shape{
	abstract void numberofsides();
}
class rectangle extends shape{
	int side;
	rectangle(int side)
  {
		this.side=side;
  }
	public void numberofsides() {
  System.out.println("no of sides of rectangle="+side);
		}
}
class triangle extends shape{
	int side;
	triangle(int side){
		this.side=side;
	}
	public void numberofsides() {
		System.out.println("no of sides of triangle="+side);
		}
	}
class hexagon extends shape{
	int side;
	hexagon(int side){
		this.side=side;
	}
	public void numberofsides() {
		System.out.println("no of sides of hexagon="+side);
	}
	
}
public class abclass{
 public static void main(String[] args){
	 rectangle rect=new rectangle(4);
	 triangle tri=new triangle(3);
	 hexagon hexa=new hexagon(6);
	 rect.numberofsides();
	 tri.numberofsides();
	 hexa.numberofsides();
 }
}

