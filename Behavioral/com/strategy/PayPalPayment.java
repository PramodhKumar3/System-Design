package com.strategy;

public class PayPalPayment implements PaymentStrategy {
	private String email;

	public PayPalPayment(String email) {
		super();
		this.email = email;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Paid $" + amount + " using PayPal account: " + email);
	}

}
