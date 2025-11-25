package com.mediator;

public class User {
	private String name;
	private ChatRoom chatRoom;

	public User(String name, ChatRoom chatRoom) {
		super();
		this.name = name;
		this.chatRoom = chatRoom;
	}

	public String getName() {
		return name;
	}

	public void sendMessage(String message) {
		chatRoom.sendMessage(message, this);
	}

	public void receiveMessage(String message, User sender) {
		System.out.println(sender.getName() + " to " + name + ": " + message);
	}
}
