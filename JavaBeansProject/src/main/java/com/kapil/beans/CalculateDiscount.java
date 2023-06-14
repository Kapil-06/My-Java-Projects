package com.kapil.beans;

public class CalculateDiscount {
	
	private double amount;
	private double discount;
	
	public CalculateDiscount() {
		amount=0;
		discount=0;
	}

	public double getDiscount() {
		return discount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
		if(amount>15000) {
			discount=amount*15/100;
		}
		else {
			discount=amount*8/100;
		}
	}
	
	
}
