package com.command.devices;

import com.command.MusicSystem;

public class MusicPlayCommand implements Command {
	private MusicSystem music;

	public MusicPlayCommand(MusicSystem music) {
		this.music = music;
	}

	public void execute() {
		music.play();
	}

	public void undo() {
		music.stop();
	}
}
