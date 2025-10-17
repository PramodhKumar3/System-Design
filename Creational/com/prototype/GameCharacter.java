package com.prototype;

public class GameCharacter implements Cloneable {

	private String name;
	private int health;
	private int armor;
	private String weapon;
	private String[] skills;

	public GameCharacter(String name, int health, int armor, String weapon, String[] skills) {
		super();
		this.name = name;
		this.health = health;
		this.armor = armor;
		this.weapon = weapon;
		this.skills = skills;
	}

	public GameCharacter clone() {
		// Deep copy of skills array
		String[] clonnedSkills = skills != null ? skills.clone() : null;
		return new GameCharacter(name, health, armor, weapon, clonnedSkills);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "GameCharacter: [ Name = " + name + ", Health = " + health + ", Armor = " + armor + ", Weapon = "
				+ weapon + ", Skills = " + String.join(", ", skills) + " ]";
	}

}
