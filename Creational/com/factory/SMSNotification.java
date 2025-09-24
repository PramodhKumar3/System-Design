package com.factory;

//Step4: Create another class that implements Notification interface and overrides the method
public class SMSNotification implements Notification {

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending SMS: " + message);
	}

}
