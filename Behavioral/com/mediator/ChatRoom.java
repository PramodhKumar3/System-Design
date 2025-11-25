package com.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	List<User> users = new ArrayList<>();

	public void addUser(User user) {
		users.add(user);
	}

	public void sendMessage(String message, User sender) {
		for (User user : users) {
			if (user != sender)
				user.receiveMessage(message, sender);
		}
	}
}
