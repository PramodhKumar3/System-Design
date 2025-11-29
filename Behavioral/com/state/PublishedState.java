package com.state;

public class PublishedState implements DocumentState {

	@Override
	public void edit(Document document) {
		System.out.println("Cannot edit a published document.");
	}

	@Override
	public void publish(Document document) {
		System.out.println("Document is already published.");
	}

	@Override
	public void archive(Document document) {
		System.out.println("Archiving published document...");
		document.setState(new DraftState());
	}

}
