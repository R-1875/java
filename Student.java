package InputOutput;

import java.io.Serializable;

public class Student implements Serializable{
	
	String name;
	int id;
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
}
