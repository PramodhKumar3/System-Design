package com.singleton;

public class Logger {

	// Step1: Create private static instance of the class
	private static Logger logger = null;

	// Step2: Create private constructor such that no other class can instantiate
	private Logger() {
		System.out.println("[LOG] Singleton Logger object is created....");
	}

	// Step3: createInstance method for Singleton Object instantiation and with Multi-Threading & Synchronization
	public static Logger createInstance() {
		if (logger == null) {
			synchronized (Logger.class) {
				if (logger == null)
					logger = new Logger();
			}
		}
		return logger;
	}

	// Step4: Create a log method to write the logs
	public void log(String message) {
		System.out.println("[LOG] " + message);
	}
}

