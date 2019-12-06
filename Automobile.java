package Polymorphism;

public class Automobile {
	
	public String colour;
	public String engine;
	
	public Automobile(String c, String e)
	{
		colour = c;
		engine = e;
		System.out.println("This is an Automobile ");
	}
	
	public void Run()
	{
		System.out.println("Automobile runs on the road");
	}

}
