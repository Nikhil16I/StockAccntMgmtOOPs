package com.StockManagement;

import java.util.Scanner;

public class Account {
 static Scanner input = new Scanner(System.in);
 
  int AccntBalance = 0;
   

public void Credit() {
	// TODO Auto-generated method stub
System.out.println("Enter Ammount to Credit - ");
	 int CreditBal =input.nextInt();
	 AccntBalance += CreditBal;
System.out.println("Your Account Balance is - " +AccntBalance);	
}

public void Debit() {
	// TODO Auto-generated method stub
	System.out.println("Enter Debit Ammount = ");
	   int DebitBal = input.nextInt();
	   
	   
	   if (DebitBal<= AccntBalance) {
		    AccntBalance-= DebitBal;
System.out.println("Your Account Balance is - " +AccntBalance );		    
		
	}
	   else {
System.out.println("*Insufficiet Balance*");		   
	   }

	
 }
}
