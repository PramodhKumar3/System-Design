package com.singleton;

public class NotificationModule {
	// NotificationModule method trying to create singleton object instance
	public void processNotification() {
		Logger logger = Logger.createInstance();
		logger.log("NotificationModule: Sending Notification....");
	}
}

