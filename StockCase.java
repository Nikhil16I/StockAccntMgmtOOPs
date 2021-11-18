package com.StockManagement;

public class StockCase {
	
	String StockName;
	int NumofShares;
	int Price;
	static int StockValue;

	public StockCase(String StockName, int NumofShares, int Price, int StockValue) {
		// TODO Auto-generated constructor stub
		this.StockName = StockName;
		this.NumofShares= NumofShares;
		this.Price=Price;
		StockCase.StockValue=StockValue;
		
	}

	public String getStockName() {
		return StockName;
	}

	public void setStockName(String stockName) {
		StockName = stockName;
	}

	public int getNumofShares() {
		return NumofShares;
	}

	public void setNumofShares(int numofShares) {
		NumofShares = numofShares;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public static int getStockValue() {
		return StockValue;
	}

	public void setStockValue(int stockValue) {
		StockValue = stockValue;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ( "StockName = "+getStockName()+ "Add Shares = "+getNumofShares()+ "Price of Share = "+getPrice()+"Stock Value is = "+getStockValue());
	}



	

}
