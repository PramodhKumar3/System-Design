package com.flyweight;

public class FlyweightMain {
	public static void main(String[] args) {
		String text = "HELLO";
		int x = 0;

		for (char c : text.toCharArray()) {
			Character character = CharacterFactory.getCharacter(c, "Arial", 12);
			character.render(x, 10);
			x += 15; // Move position for next character
		}

		// Reuse same characters for another word
		String text2 = "HOPE";
		x = 0;
		for (char c : text2.toCharArray()) {
			Character character = CharacterFactory.getCharacter(c, "Arial", 12);
			character.render(x, 30);
			x += 15;
		}
	}
}
