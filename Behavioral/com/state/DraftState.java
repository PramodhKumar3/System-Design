package com.state;

public class DraftState implements DocumentState {

	@Override
	public void edit(Document document) {
		System.out.println("Editing the draft...");
	}

	@Override
	public void publish(Document document) {
		System.out.println("Moving document to Moderation...");
		document.setState(new ModerationState());
	}

	@Override
	public void archive(Document document) {
		System.out.println("Cannot archive a draft document.");
	}

}
