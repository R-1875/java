package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestIO {

	public static void main(String[] args) {
		
		try
		{
		Student s = new Student("Rahul", 121);
		FileOutputStream fout = new FileOutputStream("D:\\\\NOV 7\\\\JAVA\\\\F.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s);
		out.flush();
		out.close();
		System.out.println("Success");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		try
		{
			FileInputStream fin = new FileInputStream("D:\\\\NOV 7\\\\JAVA\\\\F.txt");
			ObjectInputStream fin1 = new ObjectInputStream(fin);
			FileInputStream in;
			Student s = (Student)fin1.readObject();
			System.out.println(s.id+" "+s.name);
			fin1.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
