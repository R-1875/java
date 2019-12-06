package Constructor;

public class Aloevera extends Plant{
	
	public String taste;
	
	/*public Aloevera()
	{
		System.out.println("This is Aloevera");
	}*/
	
	public Aloevera(String c, int h, String t, int a, String ta)
	{
		super(c,h,t,a);
		taste = ta;
		System.out.println("This is bitter in taste");
	}

}
