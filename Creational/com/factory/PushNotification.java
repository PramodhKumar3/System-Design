package com.factory;

//Step3: Create another class that implements Notification interface and overrides the method
public class PushNotification implements Notification {

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending PUSH Notification: " + message);
	}

}
