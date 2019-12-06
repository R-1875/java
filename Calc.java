package AllMethos;

import java.util.Scanner;

public class Calc {
	
	public int Add(int a, int b)
	{
		int sum;
		sum = a + b;
		return sum;
	}
	
	public float SimpleInt(float p, float t, float r) 
	{
		float SI;
		SI = (p*t*r)/100;
		return SI;
	}
	
	public float CircleArea(int r)
	{
		float Area;
		Area = 3.14f*r*r;
		return Area;
	}
	
	public String Greetings(String one, String two)
	{
		String Concat;
		Concat = one + two;
		return Concat;
		
	}
	
	

}
