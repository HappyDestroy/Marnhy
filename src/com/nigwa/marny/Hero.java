/*
 * R�alis� par Martin Cesbron et Nicolas Saboureau � l'IIA de Laval
 * 
 * Cr�ation de l'objets H�ro
* int health : 	Sant� du H�ro
* int attack : Attaque du H�ro
* int armor :  Armur du H�ro
* int gold :   Gold du H�ro
* int potion : Nombre de potions du H�ro
* Helmet helmet : Casque du H�ro
* Shield shield : Bouclier du H�ro
* Weapon weapon : Arme du Hero
 */
package com.nigwa.marny;

import java.io.Serializable;


public class Hero extends Object implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int health;
	private int attack;
	private int armor;
	private int gold;
	private int potion;
	private Helmet helmet;
	private Shield shield;
	private Weapon weapon;
	

	
	public Hero(int health, int attack, int armor, int gold, Helmet helmet, Shield shield, Weapon weapon, int potion) {
		this.health = health;
		this.attack = attack;
		this.armor = armor;
		this.gold = gold;
		this.helmet = helmet;
		this.shield = shield;
		this.weapon = weapon;
		this.potion = potion;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public Helmet getHelmet() {
		return helmet;
	}

	public void setHelmet(Helmet helmet) {
		this.helmet = helmet;
	}

	public Shield getShield() {
		return shield;
	}

	public void setShield(Shield shield) {
		this.shield = shield;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getPotion() {
		return potion;
	}

	public void setPotion(int potion) {
		this.potion = potion;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Votre h�ro a " + this.health + " point(s) de vie, " + 
				this.attack + " points d'attaque, " + 
				this.armor + " points d'armure et " + 
				this.gold + " gold.";
	}
}
