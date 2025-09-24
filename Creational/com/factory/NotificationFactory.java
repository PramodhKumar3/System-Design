package com.factory;

// Step5: Create a Factory class that create a new Object for each notification class based on type
public class NotificationFactory {
	public static Notification createNotification(String type) {
		if (type == null)
			throw new IllegalArgumentException("Notification type can't be null!!!");
		switch (type.toLowerCase()) {
		case "email":
			return new EmailNotification();
		case "sms":
			return new SMSNotification();
		case "push":
			return new PushNotification();
		default:
			throw new IllegalArgumentException("Unknown Notification type: " + type);
		}
	}
}
