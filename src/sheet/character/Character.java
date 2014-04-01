package sheet.character;

import java.util.ArrayList;

public class Character {
	/*
	 * HP
	 * MP
	 * PP
	 * STR
	 * DEX
	 * MND
	 * LCK
	 */
	int[] stats = new int[7];
	/*
	 * Current:
	 * HP
	 * MP
	 * PP
	 */
	int[] current = new int[3];
	/*
	 * Movement:
	 * Normal
	 * Swim
	 * Climb
	 * Jump
	 */
	int[] move = new int[4];
	/*
	 * Actions:
	 * Main
	 * Attack
	 * Cast
	 */
	int[] actions = new int[3];
	/*
	 * Dice:
	 * HP Die
	 * MP Die
	 * PP Die
	 */
	String[] dice = new String[4];
	/*
	 * Storage:
	 * Used
	 * Worn
	 * Total
	 */
	int[] storage = new int[3];
	String abilityStartingPackage, equiptStartingPackage, misc, description;
	long CC;
	int usedAP/*calculated?*/, totalAP, lifespan, age;
	String name, race;
	Armor armor;
	ArrayList<Weapon> weapons;
	ArrayList<String> abilities = new ArrayList<String>(), 
			spells = new ArrayList<String>(), 
			inventory = new ArrayList<String>(),
			bonuses = new ArrayList<String>();
	public Character(int[] stats, int[] current, int[] move, int[] actions, String[] dice, int[] storage, String abStarting, String equiptStarting, String misc, String desc,
			long CC, int usedAP, int totalAP, int lifespan, int age, String name, String race, Armor armor, ArrayList<Weapon> weapons, ArrayList<String> abilities,
			ArrayList<String> spells, ArrayList<String> inventory, ArrayList<String> bonuses) {
		this.stats = stats;
		this.current = current;
		this.move = move;
		this.actions = actions;
		this.dice = dice;
		this.storage = storage;
		this.abilityStartingPackage = abStarting;
		this.equiptStartingPackage = equiptStarting;
		this.misc = misc;
		this.description = desc;
		this.CC = CC;
		this.usedAP = usedAP;
		this.totalAP = totalAP;
		this.lifespan = lifespan;
		this.age = age;
		this.name = name;
		this.race = race;
		this.armor = armor;
		this.weapons = weapons;
		this.abilities = abilities;
		this.spells = spells;
		this.inventory = inventory;
		this.bonuses = bonuses;
	}
}
class Weapon {
	int damage, toHit, gemSlot;
	String[] enchantments;
	public Weapon(int dam, int hit, int gem, String[] enchant) {
		if(enchant.length < gem) {
			enchantments = new String[gem];
			for(int i = 0; i < enchant.length; i++) {
				enchantments[i] = enchant[i];
			}
		}
		damage = dam;
		toHit = hit;
		gemSlot = gem;
	}
}
class Armor {
	int score, reductRate, reductThreshold;
	public Armor(int sc, int RR, int RT) {
		score = sc;
		reductRate = RR;
		reductThreshold = RT;
	}
}