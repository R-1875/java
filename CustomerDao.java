package org;
import java.util.List;

public interface CustomerDao {
	
	Customer viewProfile(int Customer_id);
	List<Customer> viewAllCustomer();
	public int transfer(String un, String pass, long amount, int acc_no);
	//public double viewBalance(int id);
	//Loan viewLoan(int id);
	//void updateProfile(int id, Customer cust);
	//List list();
	//List<Transaction> transactionhistory(int id);

	
	//public int loginValidation(String username, String password);
	

}
