package Exception;

public class Gen {
	
	public void Method1() {
	try {
	int x = 10;
	int y = 2;
	int z = x/y;
	
	System.out.println(z);
	}catch(ArithmeticException e)
	{
	System.out.println("Divide by zero");
	}
	}
	
	public void Method2()
	{
		try {
			int[] a = new int[3];
			a[0] = 1;
			a[1] = 2;
			a[2] = 3;
			a[3] = 4;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Refering out of Array size");
	
		}
	}
	
	public void Method3()throws Exception
	{
		int x = 10/0;
		System.out.println("Declaring Exception");
	}
	
	public void CheckAge(int age)throws InvalidAgeException
	{
		if(age < 18)
		throw new InvalidAgeException("You are not an Adult");
		else
			System.out.println("You are an Adult");
	}

}
