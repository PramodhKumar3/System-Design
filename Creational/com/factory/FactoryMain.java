package com.factory;

public class FactoryMain {
	public static void main(String[] args) {
		Notification email = NotificationFactory.createNotification("EMAIL");
		Notification sms = NotificationFactory.createNotification("SMS");
		Notification push = NotificationFactory.createNotification("PUSH");

		email.notifyUser("Welcome to Factory Method Email Notification!");
		sms.notifyUser("Your OTP is XXXX98.");
		push.notifyUser("You have a new message from Factory method.");
	}
}
