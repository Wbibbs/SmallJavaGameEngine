package PartTwo;

import java.*;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {//Intro and loop things here
		int weaponOdds = 0;	//1 is chest weapon, 0 is random weapon
	}
	public static void getWeapon(int x) {
		if(x == 1)
			WeaponGenerator.chestWeapon(); //gets a random weapon with a guaranteed good effect
		else
			WeaponGenerator.randomWeapon();	//gets a random weapon with a chance of good or bad effects
	}
}
