package com.state;

public class ModerationState implements DocumentState {

	@Override
	public void edit(Document document) {
		System.out.println("Cannot edit while in moderation.");
	}

	@Override
	public void publish(Document document) {
		System.out.println("Publishing document...");
		document.setState(new PublishedState());
	}

	@Override
	public void archive(Document document) {
		System.out.println("Archiving document from moderation...");
		document.setState(new DraftState());
	}

}
