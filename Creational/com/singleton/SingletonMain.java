package com.singleton;

public class SingletonMain {
	public static void main(String[] args) {
		UserModule userModule = new UserModule();
		PaymentModule paymentModule = new PaymentModule();
		NotificationModule notificationModule = new NotificationModule();

		userModule.processUser();
		paymentModule.processPayment();
		notificationModule.processNotification();
	}
}
