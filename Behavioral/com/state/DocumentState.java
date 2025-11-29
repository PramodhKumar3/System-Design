package com.state;

public interface DocumentState {

	public void edit(Document document);

	public void publish(Document document);

	public void archive(Document document);
}
