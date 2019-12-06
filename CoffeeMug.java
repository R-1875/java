package Interface;

public class CoffeeMug implements Wash{
	
	public void wash()
	{
		System.out.println("Wash your Coffee Mug");
	}
	
	public void addLiquid(Liquid lq)
	{
		if(lq instanceof Liquid)
		{
			lq.Swirl();
			System.out.println("You got water");
		}
		else if(lq instanceof Milk)
		{
			lq.Swirl();
			System.out.println("You got toned milk");
		}
		else
		{
			System.out.println("You got latte");
		}
	}
	

}
