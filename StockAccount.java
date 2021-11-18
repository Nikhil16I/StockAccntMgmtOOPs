package com.StockManagement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class StockAccount {
	
static Scanner sc = new Scanner(System.in);
	static ArrayList<StockCase> Stock = new ArrayList<StockCase>();
	
	
	
	public static ArrayList<StockCase> getStock() {
		return Stock;
	}
	public static void setStock(ArrayList<StockCase> stock) {
		Stock = stock;
	}
	
public void NumofStocks() {
	System.out.println("Add Number of Stocks = ");
	int Input = sc.nextInt();
	
	
for(int i=0; i < Input; i++ ) {
	NumofStocks();
	}
 }
   
public static void AddingStocks() {
	System.out.println("Name of Stock = ");
	String StockName = sc.next();
	
	System.out.println("Add Number of Sahres = ");
	int NumofShares =sc.nextInt();
	
	System.out.println("Add Share Price = ");
	int Price = sc.nextInt();
	
	System.out.println("Value of Stock ic  = ");
	int StockValue=sc.nextInt();
	
	StockCase AddSstock = new StockCase(StockName,NumofShares,Price,StockValue);
	Stock.add(AddSstock);
	
	System.out.println("Stock Added Succesfully in StockCase");
}

public void DisplayStocks() {
 for (Iterator<StockCase> iterator = Stock.iterator(); iterator.hasNext();) {
	iterator.next();
	
}
 TotalStockValue();
}
	
public void TotalStockValue() {
	int totalstockvalue = 0;
	for (StockCase  StockAccount: Stock) {
		totalstockvalue+= StockCase.getStockValue();
		
	}
	System.out.println("Total Value of Stock Is = " + totalstockvalue);
}
 public static void main (String[]Msg) {
	 System.out.println("STOCK ACCOUNT MANAGEMENT PROGRAM");
	  StockAccount obj =new StockAccount();
	  obj.NumofStocks();
	  obj.DisplayStocks();
	
   }
}
