package Org;

public class Dog {
	public String name;
	public String breed;
	public int lifespan; 


public void display()
{
	System.out.println("Dog Info: ");
	System.out.println("Name: "+name);
	System.out.println("Breed: "+breed);
	System.out.println("Lifespan: "+lifespan+"\n");
	System.out.println(name+" is a "+breed+" and has "+lifespan+" years of lifespan\n");
}
}
