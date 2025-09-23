package com.singleton;

public class UserModule {
	// UserModule method trying to create singleton object instance
	public void processUser() {
		Logger logger = Logger.createInstance();
		logger.log("UserModule: Processing User data....");
	}
}
