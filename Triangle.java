package Inheritance;

public class Triangle extends Shapes{
	public int sides = 3;
	
	public void display()
	{
		System.out.println("Triangle is Blue in colour");
	}
	
	public void calc_area()
	{
		System.out.println("Area is 0.5*l*h \n");
	}
	
}
