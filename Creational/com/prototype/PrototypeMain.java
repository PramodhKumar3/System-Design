package com.prototype;

public class PrototypeMain {

	public static void main(String[] args) {
		// Create Warrior prototype
		GameCharacter warriorPrototype = new GameCharacter("Warrior Prototype", 150, 100, "Sword",
				new String[] { "Slash", "Block", "Charge" });

		// Clone and customize
		GameCharacter warrior1 = warriorPrototype.clone();
		warrior1.setName("Thorin");
		warrior1.setWeapon("Axe");

		GameCharacter warrior2 = warriorPrototype.clone();
		warrior2.setName("Bjorn");
		warrior2.setWeapon("Hammer");

		// Display characters
		System.out.println(warriorPrototype);
		System.out.println("\n" + warrior1);
		System.out.println("\n" + warrior2);
	}
}
