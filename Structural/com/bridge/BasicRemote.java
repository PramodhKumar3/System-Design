package com.bridge;

public class BasicRemote extends RemoteControl {

	public BasicRemote(Device device) {
		super(device);
	}

	@Override
	public void turnOn() {
		device.turnOn();
	}

	@Override
	public void turnOff() {
		device.turnOff();
	}

}
