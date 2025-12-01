package com.strategy;

public class StrategyMain {
	public static void main(String[] args) {
		PaymentContext context = new PaymentContext();

		// Pay using Credit Card
		context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
		context.pay(250.00);

		// Switch to PayPal
		context.setPaymentStrategy(new PayPalPayment("payment@gmail.com"));
		context.pay(150.00);

		// Switch to UPI
		context.setPaymentStrategy(new UPIPayment("phonepay@upi"));
		context.pay(100.00);
	}
}
