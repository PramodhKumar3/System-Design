package com.singleton;

public class PaymentModule {
	// PaymentModule method trying to create singleton object instance
	public void processPayment() {
		Logger logger = Logger.createInstance();
		logger.log("PaymentModule: Processing Payment information....");
	}
}
