
package org;

import java.sql.Connection;
import org.CustomerDaoImpl;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OurBank {

	// Connection Factory
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}

	public void userAuthentication() throws Exception {
		
			con = getConnection();
			// con = getConnection();
			/*
			 * String query =
			 * "select Customer_Username, Customer_Password from Customer where "; Statement
			 * st = (Statement) con.createStatement(); ResultSet rs = ((java.sql.Statement)
			 * st).executeQuery(query);
			 */
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter username");
			String accepted_un = scn.next();
			System.out.println("Enter password");
			String accepted_pass = scn.next();

			/*
			 * String url="jdbc:mysql://localhost:3306/swissbank?useSSL=false"; String
			 * uname="root"; String pass="1234"; Class.forName("com.mysql.cj.jdbc.Driver");
			 * Connection con=DriverManager.getConnection(url,uname,pass);
			 */
			String query = "select Customer_Username,Customer_Password from customer";

			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(query);
			//String un = rs.getString("Customer_Username");
			//String pass = rs.getString("Customer_Password");
			while (rs.next()) {
				String un = rs.getString("Customer_Username");
				String pass = rs.getString("Customer_Password");
				System.out.println("testttttttttttttttttttt");
				System.out.println("number 1"+un);
				System.out.println("number 1"+pass);
				System.out.println("number 1"+accepted_un);
				System.out.println("number 1"+accepted_pass);
				if ((rs.getString("Customer_Username")).equals(un) && (rs.getString("Customer_Password")).equals(pass)) {
					System.out.println("--------------------User Authentication Success-------------------");
					System.out.println();
					int f2 = 1;

					while (f2 != 0) {
						System.out.println("Enter the choice:");
						System.out.println("1:Update Profile");
						System.out.println("2:Check Balance");
						System.out.println("3:Withdraw");
						System.out.println("4:Deposit");
						System.out.println("5:MiniStatement");
						System.out.println("6:Transfer");
						System.out.println("7:Create Account");
						System.out.println("8:Delete Account");
						System.out.println("9:Exit ");

						int ch1 = scn.nextInt();
						switch (ch1) {
						case 1:
							break;
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						case 6:
							CustomerDaoImpl cdi = new CustomerDaoImpl();
							System.out.println("Enter acc_no");
							int acc_no = scn.nextInt();
							System.out.println("enter amount");
							long amount = scn.nextLong();
							/*
							 * String pass=" "; String un=" ";
							 */
							System.out.println(un);
							System.out.println(pass);
							cdi.transfer(accepted_un, accepted_pass, amount, acc_no) ;

							break;
						case 7:
							break;
						case 8:
							break;
						case 9:
							System.exit(0);
						}
					}
				}
			}
		

		con.close();
	}

	public void adminAuthentication() throws Exception {
		try {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter adminname");
			String accepted_an = scn.next();
			System.out.println("Enter adminpassword");
			String accepted_passw = scn.next();

			/*
			 * String url="jdbc:mysql://localhost:3306/swissbank?useSSL=false"; String
			 * uname="root"; String pass="1234"; Class.forName("com.mysql.cj.jdbc.Driver");
			 * Connection con=DriverManager.getConnection(url,uname,pass);
			 */
			con = getConnection();
			String query = "select admin_username,admin_password from admin";
			Statement st = (Statement) con.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
			rs.next();

			// int acc_no=rs.getInt("customer_ac_no");
			if ((rs.getString("admin_username")).equals(accepted_an)
					&& (rs.getString("admin_password")).equals(accepted_passw)) {
				System.out.println("--------------------Admin Authentication Success-------------------");
				System.out.println();
				int f3 = 1;
				while (f3 != 0) {
					System.out.println("Enter the choice:");
					System.out.println("1:View Profile");
					System.out.println("2:View All Accounts");
					System.out.println("3:Remove Account");
					System.out.println("4:View All Transactions");
					System.out.println("5:Search by Account Number");
					System.out.println("6:Exit");

					int ch2 = scn.nextInt();
					switch (ch2) {
					case 1:

						CustomerDaoImpl cdi = new CustomerDaoImpl();
						System.out.println("enter customer id");
						Scanner sc = new Scanner(System.in);
						int ID;
						ID = sc.nextInt();
						cdi.viewProfile(ID);
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						System.exit(0);
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		con.close();
	}
}
