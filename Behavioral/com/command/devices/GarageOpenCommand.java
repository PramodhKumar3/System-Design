package com.command.devices;

import com.command.GarageDoor;

public class GarageOpenCommand implements Command {
	private GarageDoor garage;

	public GarageOpenCommand(GarageDoor garage) {
		this.garage = garage;
	}

	public void execute() {
		garage.open();
	}

	public void undo() {
		garage.close();
	}
}