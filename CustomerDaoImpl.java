package org;

import org.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomerDaoImpl implements CustomerDao {
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}

	public Customer viewProfile(int Customer_id) {
		try {
			con = getConnection();
			/*
			 * Scanner scn=new Scanner(System.in); System.out.println("Enter username");
			 * String accepted_un=scn.next(); System.out.println("Enter password"); String
			 * accepted_pass=scn.next();
			 */

			String query = "select * from customer";
			Statement st = (Statement) con.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
			// List<Customer> custo = new ArrayList<Customer>();
			// Customer cu = new Customer();
			// List<Customer> cus = ((Collection<Customer>) cu).stream()
			// .collect(Collectors.toList());
			rs.next();

			// System.out.println(cu);
			System.out.println(rs.getInt("Customer_Id"));
			System.out.println(rs.getString("Customer_name"));
			System.out.println(rs.getString("Customer_DOB"));
			System.out.println(rs.getInt("Customer_Acc_no"));
			System.out.println(rs.getString("Customer_Email"));
			System.out.println(rs.getLong("Customer_Phone"));
			System.out.println(rs.getLong("Customer_Aadhar"));
			System.out.println(rs.getString("Customer_Username"));
			System.out.println(rs.getString("Customer_Password"));
			System.out.println(rs.getString("Customer_Loan"));
			System.out.println(rs.getString("Customer_Acc_Type"));
			System.out.println(rs.getString("Customer_Branch_IFSC"));

		} catch (Exception e) {
			System.out.println("exception caught");
		}
		return null;

	}
	

	@Override
	public List<Customer> viewAllCustomer() {
		List<Customer> custo = new ArrayList<Customer>();
		try {
			con = getConnection();

			String query = "select * from customer";
			Statement st = (Statement) con.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query);

			while (rs.next()) {

				int id = rs.getInt(1);
				int ac = rs.getInt(2);
				int bal = rs.getInt(3);
				String cname = rs.getString(4);
				String dob = rs.getString(5);
				String email = rs.getString(6);
				long ph = rs.getLong(7);
				long adhar = rs.getLong(8);
				String pan = rs.getString(9);
				String uname = rs.getString(10);
				String pwd = rs.getString(11);
				String loan = rs.getString(12);
				String actype = rs.getString(13);
				String branch = rs.getString(14);
				custo.add(
						new Customer(id, ac, bal, cname, dob, email, ph, adhar, pan, uname, pwd, loan, actype, branch));
			}
			custo.stream().forEach(p -> System.out.println(p.getCustomer_Acc_no() + "***" + p.getCustomer_id() + "***"
					+ p.getCustomer_name() + "***" + p.getCustomer_DOB() + "***" + p.getCustomer_Email() + "***"
					+ p.getCustomer_Phone() + "***" + p.getCustomer_Aadhar() + "***" + p.getCustomer_PAN() + "***"
					+ p.getCustomer_Username() + "***" + p.getCustomer_Password() + "***" + p.getCustomer_Loan() + "***"
					+ p.getCustomer_Acc_Type() + "***" + p.getCustomer_Branch_IFSC()));

			/*
			 * System.out.println(rs.getString("Customer_Id"));
			 * System.out.println(rs.getString("Customer_name"));
			 * System.out.println(rs.getString("Customer_DOB"));
			 * System.out.println(rs.getString("Customer_Acc_no"));
			 * System.out.println(rs.getString("Customer_Email"));
			 * System.out.println(rs.getString("Customer_Phone"));
			 * System.out.println(rs.getString("Customer_Aadhar"));
			 * System.out.println(rs.getString("Customer_Username"));
			 * System.out.println(rs.getString("Customer_Password"));
			 * System.out.println(rs.getString("Customer_Loan"));
			 * System.out.println(rs.getString("Customer_Acc_Type"));
			 * System.out.println(rs.getString("Customer_Branch_IFSC"));
			 */

		} catch (Exception e) {
			System.out.println("exception caught");
		}
		return custo;

	}
	
	
	public Customer viewProfile1(int Customer_id) {
		//Scanner scd = new Scanner(System.in);
		//int i= scd.nextInt();
		//List<Customer> custom = new ArrayList<Customer>();
		//custom.stream()
		//.filter(c->c.getCustomer_id() == i)
		//.forEach(c->System.out.println(c.getCustomer_Balance()));
		try {
			con = getConnection();
			/*
			 * Scanner scn=new Scanner(System.in); System.out.println("Enter username");
			 * String accepted_un=scn.next(); System.out.println("Enter password"); String
			 * accepted_pass=scn.next();
			 */

			String query = "select Customer_Balance from Customer where Customer_Id=" +Customer_id+ ";";
			Statement st = (Statement) con.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
			// List<Customer> custo = new ArrayList<Customer>();
			// Customer cu = new Customer();
			// List<Customer> cus = ((Collection<Customer>) cu).stream()
			// .collect(Collectors.toList());
			rs.next();

			System.out.println(rs.getInt("Customer_Balance"));
			// System.out.println(cu);
			/*System.out.println(rs.getInt("Customer_Id"));
			System.out.println(rs.getString("Customer_name"));
			System.out.println(rs.getString("Customer_DOB"));
			System.out.println(rs.getInt("Customer_Acc_no"));
			System.out.println(rs.getString("Customer_Email"));
			System.out.println(rs.getLong("Customer_Phone"));
			System.out.println(rs.getLong("Customer_Aadhar"));
			System.out.println(rs.getString("Customer_Username"));
			System.out.println(rs.getString("Customer_Password"));
			System.out.println(rs.getString("Customer_Loan"));
			System.out.println(rs.getString("Customer_Acc_Type"));
			System.out.println(rs.getString("Customer_Branch_IFSC"));*/

		} catch (Exception e) {
			System.out.println("exception caught");
			
		}
		return null;

	}
	

	@Override
	public int transfer(String un, String pass, long amount, int acc_no) {//cdi.transfer(un, pass, amount, acc_no);
		// TODO Auto-generated method stub
		try
		{
		con = getConnection();
		//adding
		String query = "select Customer_Balance from Customer where Customer_Username='"+un+"' and Customer_Password='"+pass+"';";
		Statement st = (Statement) con.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
		rs.next();
		System.out.println("Q1"+query);
		long bal = rs.getLong(1);
		long Bal = bal-amount;
		
		System.out.println(Bal);
		
		String query1 = "update Customer set Customer_Balance = "+Bal+" where Customer_Username='"+un+"' and Customer_Password='"+pass+"';";
		Statement st1 = (Statement) con.createStatement();
		st1.executeUpdate(query1);
		System.out.println(query1);
		
		
		//adding
		String query3="select Customer_Balance from Customer where Customer_Acc_no="+acc_no+"";
		Statement st3=(Statement) con.createStatement();
		ResultSet rs3=st3.executeQuery(query3);
		rs3.next();
		long balance1=rs3.getLong(1);
		long bal1=balance1+amount;
		System.out.println(bal1);
		
		String query2="update Customer set Customer_Balance="+bal1+" where Customer_Acc_no="+acc_no+"";
		Statement st2=(Statement) con.createStatement();
		st2.executeUpdate(query2);
		//System.out.println("Balance="+rs.getInt("balance"));
		System.out.println("Successfully tranferred");
		
		String query4="select max(trans_id) from transaction ";
		Statement st4=(Statement) con.createStatement();
		st4.executeQuery(query4);
		ResultSet rs4=st4.executeQuery(query4);
		rs4.next();
		
		int temp_id=rs4.getInt(1);
		temp_id = temp_id+1;
		
		String query8 = "select Customer_Acc_no from Customer where Customer_Username='"+un+"'";
		Statement st8=(Statement) con.createStatement();
		ResultSet rs8=st8.executeQuery(query8);
		//st8.executeQuery(query8);
		rs8.next();
		String sender=rs8.getString(1);
		int temp_id1=temp_id+1;
		
		String query5 = "insert into transaction(trans_id,debit,acct_no) values("+temp_id1+","+amount+","+sender+")";
		Statement st5=(Statement) con.createStatement();
		st5.executeUpdate(query5);
		
		/*String query6="select max(trans_id) from transaction ";
		Statement st6=(Statement) con.createStatement();
		st.executeQuery(query6);
		ResultSet rs6=st.executeQuery(query6);
		rs6.next();
		
		/*int temp_id1=rs6.getInt(1);
		temp_id1 = temp_id1+1;*/
		int temp_id2=temp_id+2;
		
		String query7 = "insert into transaction(trans_id,credit,acct_no) values("+temp_id2+","+amount+","+acc_no+")";
		Statement st7=(Statement) con.createStatement();
		st7.executeUpdate(query7);
		
		
		System.out.println("shb");
		
		//System.out.println("Balance="+rs.getInt("balance"));
		System.out.println("Successfully tranferred");
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
}
/*
 * List<Customer> viewAllCustomer(){
 * 
 * } public int transfer(int id, double amount, int acc_no) {
 * 
 * }
 */
