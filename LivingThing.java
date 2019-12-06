package Constructor;

public class LivingThing {
	
	public String colour;
	public int height;
	
	/*public LivingThing()
	{
		System.out.println("This is living thing");
	}*/
	
	public LivingThing(String c, int h)
	{
		colour = c;
		height = h;
		System.out.println("This is living thing constructor");
	}

	public void LivingThing(String string, int i) {
		// TODO Auto-generated method stub
		
	}
	public void grow()
	{
		System.out.println("living things grow");
	}
}
