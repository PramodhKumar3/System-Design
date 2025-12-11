package com.bridge;

public class Radio implements Device {

	@Override
	public void turnOn() {
		System.out.println("Radio is now ON.");
	}

	@Override
	public void turnOff() {
		System.out.println("Radio is now OFF.");
	}
}
