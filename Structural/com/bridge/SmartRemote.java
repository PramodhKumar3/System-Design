package com.bridge;

public class SmartRemote extends RemoteControl {

	public SmartRemote(Device device) {
		super(device);
	}

	@Override
	public void turnOn() {
		System.out.println("SmartRemote: Turning ON with extra features...");
		device.turnOn();
	}

	@Override
	public void turnOff() {
		System.out.println("SmartRemote: Turning OFF with extra features...");
		device.turnOff();
	}

	public void mute() {
		System.out.println("SmartRemote: Device muted.");
	}

}
