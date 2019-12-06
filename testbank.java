
package org;

import java.util.Scanner;

import org.OurBank;

public class testbank {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------");
		System.out.println("****************************************");
		System.out.println("-------------SWISS BANK-----------------");
		System.out.println("****************************************");
		System.out.println("----------------------------------------");
		int flag=1;
		while(flag!=0)
		{
		System.out.println("Enter Your Choice");
		System.out.println("1:User Login");
		System.out.println("2:Admin Login");
		System.out.println("3:Exit Application");
		
		OurBank ob=new OurBank();
	
		Scanner scn=new Scanner(System.in);
		int choice=scn.nextInt();
		
			switch(choice)
			{
			case 1:ob.userAuthentication();
			 
				break;
			case 2:ob.adminAuthentication();
				break;
			case 3:System.exit(0);
				
			}
		}
		}

}
