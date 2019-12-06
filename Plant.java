package Constructor;

public class Plant extends LivingThing{
	
	public String type;
	public int age;
	
	/*public Plant()
	{
		System.out.println("This is a plant ");
	}*/
	
	public Plant(String c, int h, String t, int a)
	{
		super(c,h);
		type = t;
		age = a;
		System.out.println("This is a plant constructor");
	}
	public void grow()
	{
		System.out.println("plant grows");
	}

}
