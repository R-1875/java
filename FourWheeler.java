package Polymorphism;

public class FourWheeler extends Automobile{
	
	public int wheels;
	
	public FourWheeler(String c, String e, int w)
	{
		super(c, e);
		wheels = w;
		System.out.println("This automoblie is a fourwheeler");
	}

}
