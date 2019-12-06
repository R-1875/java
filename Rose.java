package Constructor;

public class Rose extends Plant{
	
	public String fragrance;
	
	
	/*public Rose() 
	{
		System.out.println("This is rose");
	}*/
	
	public Rose(String c, int h, String t, int a, String f)
	{
		super(c,h,t,a);
		fragrance = f;
		System.out.println("This is rose has fragrance");
	}
	public void grow()
	{
		System.out.println("rose grows");
	}
}
