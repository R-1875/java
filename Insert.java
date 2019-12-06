package Org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.api.jdbc.Statement;

public class Insert {

	public static void main(String[] args)throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/students?useSSL=false";
		String username = "root";
		String password = "1234";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		String query = "select max(Roll_no) from students";
		Statement s1 = (Statement) con.createStatement();
		ResultSet rs = s1.executeQuery(query);
		int temp;
		rs.next();
		temp = rs.getInt(1);
		
		int Roll_no = temp+1;
		String firstname = "XYZ";
		String lastname = "ABC";
		int age = 20;
		String insertSt = "Insert into students values("+Roll_no+",'"+firstname+"','"+lastname+"',"+age+")";
		Statement s = (Statement) con.createStatement();
		s.executeUpdate(insertSt);
		System.out.println("Record Inserted");
		
	}

}
