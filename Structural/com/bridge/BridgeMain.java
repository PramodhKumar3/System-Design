package com.bridge;

public class BridgeMain {
	public static void main(String[] args) {
		Device tv = new TV();
		Device radio = new Radio();

		RemoteControl basicRemoteForTV = new BasicRemote(tv);
		RemoteControl smartRemoteForRadio = new SmartRemote(radio);

		System.out.println("Using Basic Remote for TV:");
		basicRemoteForTV.turnOn();
		basicRemoteForTV.turnOff();

		System.out.println("\nUsing Smart Remote for Radio:");
		smartRemoteForRadio.turnOn();
		((SmartRemote) smartRemoteForRadio).mute();
		smartRemoteForRadio.turnOff();
	}
}
