package com.command.devices;

import com.command.GarageDoor;

public class GarageCloseCommand implements Command {
	private GarageDoor garage;

	GarageCloseCommand(GarageDoor garage) {
		this.garage = garage;
	}

	@Override
	public void execute() {
		garage.close();
	}

	@Override
	public void undo() {
		garage.open();
	}
}
