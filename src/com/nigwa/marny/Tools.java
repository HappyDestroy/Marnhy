package com.nigwa.marny;

import java.util.Random;

public class Tools {
	
	/**
	 * Retourne un nombre al�atoire entre 0 et le nombre en param�tre
	 * @param length - La valuer max du nombre al�atoire
	 * @return int - Un nombre al�atoire
	 */
	public static int random(int length) {
		Random r = new Random();
		return r.nextInt(length);
	}
	
	/**
	 * Retourne un nombre al�atoire entre les 2 param�tres
	 * @param min - Le nombre minimum
	 * @param max - Le nombre maximum
	 * @return int - Un nombre al�atoire
	 */
	public static int random(int min, int max) {
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
