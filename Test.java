package Test;

import Org.Dog;
import Org.Person;

public class Test {

	public static void main(String[] args) {
		Person x1 = new Person();
		Person x2 = new Person();
		
		x1.name = "Tom";
		x1.age = 12;
		x1.place = "Bangalore";
		x1.display();
		
		x2.name = "Mary";
		x2.age = 15;
		x2.place = "Delhi";
		x2.display();
		
		Dog y1 = new Dog();
		Dog y2 = new Dog();
		
		y1.name = "Max";
		y1.breed = "Shitzu";
		y1.lifespan = 12;
		y1.display();
		
		y2.name = "Lucy";
		y2.breed = "Beagle";
		y2.lifespan = 15;
		y2.display();

	}

}
