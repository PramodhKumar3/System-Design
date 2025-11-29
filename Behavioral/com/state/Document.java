package com.state;

public class Document {
	private DocumentState state;

	public Document() {
		this.state = new DraftState(); // Initial State
	}

	public void setState(DocumentState state) {
		this.state = state;
	}

	public void edit() {
		state.edit(this);
	}

	public void publish() {
		state.publish(this);
	}

	public void archive() {
		state.archive(this);
	}
}
