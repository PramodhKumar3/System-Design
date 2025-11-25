package com.mediator;

public class MediatorMain {
	public static void main(String[] args) {
		ChatRoom chatRoom = new ChatRoom();

		User alice = new User("Alice", chatRoom);
		User bob = new User("Bob", chatRoom);
		User charlie = new User("Charlie", chatRoom);

		chatRoom.addUser(alice);
		chatRoom.addUser(bob);
		chatRoom.addUser(charlie);

		alice.sendMessage("Hello everyone!");
		bob.sendMessage("Hi Alice!");
	}
}
