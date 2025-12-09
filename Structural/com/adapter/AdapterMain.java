package com.adapter;

public class AdapterMain {
	public static void main(String[] args) {
		// Legacy system instance
		OldPaymentSystem oldSystem = new OldPaymentSystem();

		// Adapter wraps the old system
		PaymentProcessor paymentProcessor = new OldPaymentAdapter(oldSystem);

		// Client uses the new interface
		paymentProcessor.processPayment(250.75);
	}

}
