package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileExample {

	public static void main(String[] args) {
		
		/*try
		{
			FileOutputStream f = new FileOutputStream("D:\\NOV 7\\JAVA\\File.txt");
			String s = "Hello and welcome to Java class";
			byte b[] = s.getBytes()	;
			f.write(b);
			f.close();
			System.out.println("success");
		}catch(Exception e) {
		System.out.println(e);
		}
		
		try
		{
			FileInputStream fi = new FileInputStream("D:\\\\NOV 7\\\\JAVA\\\\File.txt");
			int i = 0;
			while((i = fi.read()) != -1)
			{
				System.out.print((char)i);
			}
			fi.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}*/
		
		/*try
		{
			FileWriter fw = new FileWriter("D:\\NOV 7\\JAVA\\File.txt");
			fw.write("Welcome to SLK");
			fw.close();
		}catch(Exception e) {
		System.out.println(e);
		}
		System.out.println("success");*/

		try 
		{
			FileReader fr = new FileReader("D:\\\\NOV 7\\\\JAVA\\\\File.txt");
			int i;
			while((i = fr.read()) != -1)
			{
				System.out.print((char)i);	
			}	
			fr.close();
		}catch(Exception e)
		{
			System.out.print(e);
		}
		
	}

}
