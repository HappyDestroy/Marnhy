/*
 * R�alis� par Martin Cesbron et Nicolas Saboureau � l'IIA de Laval
 * 
 * Cr�ation des objets Helmet
 * int id : Rang du casque (1-4)
 * int healthValue : Sant� apport�e par le casque
 * int attackValue : Attack apport�e par le casque
 * int armorValue : Armure apport�e par le casque
 * int price : 		Prix du casque
 * int isBuy :		Indique si le casque est achet� (1) ou non (0)
 * int isEquip :	Indique si le casque est �quip� (1) ou non (0)
 */
package com.nigwa.marny;

import java.io.Serializable;

public class Helmet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int healthValue;
	private int attackValue;
	private int armorValue;
	private int price;
	private int isBuy;
	private int isEquip;
	
	
	public Helmet(int id, int healthValue, int attackValue, int armorValue, 
			int price, int isBuy, int isEquip) {
		this.id = id;
		this.healthValue = healthValue;
		this.attackValue = attackValue;
		this.armorValue = armorValue;
		this.price = price;
		this.isBuy = isBuy;
		this.isEquip = isEquip;
	}
	
	
	public int getHealthValue() {
		return healthValue;
	}
	public void setHealthValue(int healthValue) {
		this.healthValue = healthValue;
	}
	public int getAttackValue() {
		return attackValue;
	}
	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}
	public int getArmorValue() {
		return armorValue;
	}
	public void setArmorValue(int armorValue) {
		this.armorValue = armorValue;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getIsBuy() {
		return isBuy;
	}

	public void setIsBuy(int isBuy) {
		this.isBuy = isBuy;
	}

	public int getIsEquip() {
		return isEquip;
	}

	public void setIsEquip(int isEquip) {
		this.isEquip = isEquip;
	}


	@Override
	public String toString() {
		return "+ " + this.healthValue + " point(s) de vie \n "
				+ "+ " + this.attackValue + " point(s) d'attaque \n"
				+ "+ " + this.armorValue + " point(s) d'armure.\n";
	}
}
