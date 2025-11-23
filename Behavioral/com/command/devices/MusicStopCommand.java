package com.command.devices;

import com.command.MusicSystem;

public class MusicStopCommand implements Command {
	private MusicSystem music;

	public MusicStopCommand(MusicSystem music) {
		this.music = music;
	}

	public void execute() {
		music.stop();
	}

	public void undo() {
		music.play();
	}
}