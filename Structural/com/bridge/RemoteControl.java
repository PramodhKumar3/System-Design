package com.bridge;

public abstract class RemoteControl {
	protected Device device;

	public RemoteControl(Device device) {
		super();
		this.device = device;
	}

	public abstract void turnOn();

	public abstract void turnOff();
}
