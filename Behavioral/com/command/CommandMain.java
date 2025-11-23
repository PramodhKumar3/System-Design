package com.command;

import com.command.devices.Command;
import com.command.devices.GarageOpenCommand;
import com.command.devices.LightOnCommand;
import com.command.devices.MusicPlayCommand;

public class CommandMain {
	public static void main(String[] args) {
		// Devices
		Light light = new Light();
		GarageDoor garage = new GarageDoor();
		MusicSystem music = new MusicSystem();

		// Commands
		Command lightOn = new LightOnCommand(light);
		Command garageOpen = new GarageOpenCommand(garage);
		Command musicPlay = new MusicPlayCommand(music);

		// Remote Control
		RemoteControl remote = new RemoteControl();

		// Execute commands
		remote.setCommand(lightOn);
		remote.pressButton();

		remote.setCommand(garageOpen);
		remote.pressButton();

		remote.setCommand(musicPlay);
		remote.pressButton();

		// Undo last command
		remote.pressUndo(); // Undo musicPlay
		remote.pressUndo(); // Undo garageOpen
		remote.pressUndo(); // Undo lightOn
		remote.pressUndo(); // Nothing to undo
	}
}
