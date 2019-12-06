package Polymorphism;

public class Car extends FourWheeler{
	
	public String brand;
	
	public Car(String c, String e, int w, String b)
	{
		super(c, e, w);
		brand = b;
		System.out.println("This is Audi car");
	}

}
