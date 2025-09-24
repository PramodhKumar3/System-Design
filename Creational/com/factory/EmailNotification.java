package com.factory;

// Step2: Create a class that implements Notification interface and overrides the method
public class EmailNotification implements Notification {

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending Email: " + message);
	}

}
