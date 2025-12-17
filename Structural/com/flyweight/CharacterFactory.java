package com.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
	private static final Map<String, Character> cache = new HashMap<>();

	public static Character getCharacter(char symbol, String font, int size) {
		String key = symbol + font + size;
		if (!cache.containsKey(key))
			cache.put(key, new Character(symbol, font, size));
		return cache.get(key);
	}
}
