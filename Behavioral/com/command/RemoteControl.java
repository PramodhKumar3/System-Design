package com.command;

import java.util.Stack;

import com.command.devices.Command;

public class RemoteControl {
	private Command currentCommand;
	private Stack<Command> history = new Stack<>();

	public void setCommand(Command command) {
		this.currentCommand = command;
	}

	public void pressButton() {
		if (currentCommand != null) {
			currentCommand.execute();
			history.push(currentCommand);
		}
	}

	public void pressUndo() {
		if (!history.isEmpty()) {
			Command lastCommand = history.pop();
			lastCommand.undo();
		} else {
			System.out.println("Nothing to undo.");
		}
	}
}