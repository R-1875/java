package org;

public class Customer {
	
	 private int Customer_id;
	 private int Customer_Acc_no;
	 private int Customer_Balance;
	 private String Customer_name;
	 private String Customer_DOB;
	 private String Customer_Email;
	 private long Customer_Phone;
	 private long Customer_Aadhar;
	 private String Customer_PAN;
	 private String Customer_Username;
	 private String Customer_Password; 
	private String Customer_Loan;
	private String Customer_Acc_Type;
	private String Customer_Branch_IFSC;
	public Customer(int customer_id , int customer_Acc_no,int Customer_Balance, String customer_name, String customer_DOB, String customer_Email,
			long customer_Phone, long customer_Aadhar, String customer_PAN, String customer_Username,
			String customer_Password, String customer_Loan, String customer_Acc_Type, String customer_Branch_IFSC) {
		super();
		Customer_Acc_no = customer_Acc_no;
		Customer_id = customer_id;
		Customer_name = customer_name;
		Customer_DOB = customer_DOB;
		Customer_Email = customer_Email;
		Customer_Phone = customer_Phone;
		Customer_Aadhar = customer_Aadhar;
		Customer_PAN = customer_PAN;
		Customer_Username = customer_Username;
		Customer_Password = customer_Password;
		Customer_Loan = customer_Loan;
		Customer_Acc_Type = customer_Acc_Type;
		Customer_Branch_IFSC = customer_Branch_IFSC;
	}
	public Customer() {
	}
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}
	public int getCustomer_Acc_no() {
		return Customer_Acc_no;
	}
	public void setCustomer_Acc_no(int customer_Acc_no) {
		Customer_Acc_no = customer_Acc_no;
	}
	public int getCustomer_Balance() {
		return Customer_Balance;
	}
	public void setCustomer_Balance(int customer_Balance) {
		Customer_Balance = customer_Balance;
	}
	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}
	public String getCustomer_DOB() {
		return Customer_DOB;
	}
	public void setCustomer_DOB(String customer_DOB) {
		Customer_DOB = customer_DOB;
	}
	public String getCustomer_Email() {
		return Customer_Email;
	}
	public void setCustomer_Email(String customer_Email) {
		Customer_Email = customer_Email;
	}
	public long getCustomer_Phone() {
		return Customer_Phone;
	}
	public void setCustomer_Phone(long customer_Phone) {
		Customer_Phone = customer_Phone;
	}
	public long getCustomer_Aadhar() {
		return Customer_Aadhar;
	}
	public void setCustomer_Aadhar(long customer_Aadhar) {
		Customer_Aadhar = customer_Aadhar;
	}
	public String getCustomer_PAN() {
		return Customer_PAN;
	}
	public void setCustomer_PAN(String customer_PAN) {
		Customer_PAN = customer_PAN;
	}
	public String getCustomer_Username() {
		return Customer_Username;
	}
	public void setCustomer_Username(String customer_Username) {
		Customer_Username = customer_Username;
	}
	public String getCustomer_Password() {
		return Customer_Password;
	}
	public void setCustomer_Password(String customer_Password) {
		Customer_Password = customer_Password;
	}
	public String getCustomer_Loan() {
		return Customer_Loan;
	}
	public void setCustomer_Loan(String customer_Loan) {
		Customer_Loan = customer_Loan;
	}
	public String getCustomer_Acc_Type() {
		return Customer_Acc_Type;
	}
	public void setCustomer_Acc_Type(String customer_Acc_Type) {
		Customer_Acc_Type = customer_Acc_Type;
	}
	public String getCustomer_Branch_IFSC() {
		return Customer_Branch_IFSC;
	}
	public void setCustomer_Branch_IFSC(String customer_Branch_IFSC) {
		Customer_Branch_IFSC = customer_Branch_IFSC;
	}
	

}
