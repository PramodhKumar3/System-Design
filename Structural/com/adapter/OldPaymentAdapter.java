package com.adapter;

public class OldPaymentAdapter implements PaymentProcessor {
	private OldPaymentSystem oldPaymentSystem;

	public OldPaymentAdapter(OldPaymentSystem oldPaymentSystem) {
		this.oldPaymentSystem = oldPaymentSystem;
	}

	@Override
	public void processPayment(double amount) {
		// Convert double to String because legacy system expects String
		oldPaymentSystem.makePayment(String.valueOf(amount));
	}
}
