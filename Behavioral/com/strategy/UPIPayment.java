package com.strategy;

public class UPIPayment implements PaymentStrategy {
	private String upiId;

	public UPIPayment(String upiId) {
		super();
		this.upiId = upiId;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Paid $" + amount + " using UPI ID: " + upiId);
	}

}
