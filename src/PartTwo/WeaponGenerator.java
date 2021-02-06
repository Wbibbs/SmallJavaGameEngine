package PartTwo;
import java.util.*;
public class WeaponGenerator 
{	
	public static HashMap<String, Integer> weaponDmg = new HashMap<String, Integer>(); 
	static 
	{
		weaponDmg.put("Dagger", 2);
		weaponDmg.put("Sword", 5);
		weaponDmg.put("Katana",8);
		weaponDmg.put("Recurve Bow", 4);
		weaponDmg.put("Crossbow", 6);
		weaponDmg.put("Halberd", 9);
		weaponDmg.put("Spear", 6);
		weaponDmg.put("Revolver", 5);
		weaponDmg.put("Double Barrel Shotgun", 8);
		weaponDmg.put("Novice Staff", 4);
		weaponDmg.put("Initiate Staff", 7);
		weaponDmg.put("Grand Mage Staff", 10);
		weaponDmg.put("Novice Wand", 3);
		weaponDmg.put("Initiate Wand",6);
		weaponDmg.put("Grand Wizard Wand", 10);
		weaponDmg.put("Whip", 5);
	}

	private static ArrayList <String> effects =  new ArrayList <String>(); 
	//fill effects list
	static
	{
		effects.add("Rusty");
		effects.add("Feeble");
		effects.add("Toxic");
		effects.add("Hot");
		effects.add("Charged");
		effects.add("Frosty");
		effects.add("Striker");	
	}
<<<<<<< Updated upstream
	
	public static void randomWeapon()
	{
		Random rand = new Random();	
		int i = rand.nextInt(weapons.size());
		int k = rand.nextInt(5);		//gets random num  0 - 4
		if(k == 4)			//if num = 4, add effect
		{
			int j = rand.nextInt(effects.size());		//gets random effect
			System.out.println(effects.get(j) + " " + weapons.get(i));
			wDescription(i);
			eDescription(j);
			getDamage(i);
		}
		else 		//else no effect
		{
			System.out.println(weapons.get(i));	
			wDescription(i);
			getDamage(i);
		}
		
=======

	private static String weaponKey = "";
	private static int damage = 0;

	public static void main(String []args)
	{
		randomWeapon();
		System.out.println();
		chestWeapon();
	}

	public static void randomWeapon()
	{
		Random rand = new Random();	
		int i = rand.nextInt(16);		//gets random weapon
		weaponKey = getWeapon(i);
		int k = rand.nextInt(5);					//gets random num  0 - 4
		int j = rand.nextInt(effects.size());		//gets random effect
		if(k == 4)									//if num = 4, add effect
		{
			System.out.println(effects.get(j) + " " + weaponKey);
			wDescription(weaponKey);
			eDescription(j);
			getEffectDamage(j);
		}
		else 		//else no effect
		{
			System.out.println(weaponKey);	
			wDescription(weaponKey);
			System.out.println("Damage: " + damage);
		}
		
	}

	public static void chestWeapon()		//creates a better weapon to be pulled from a chest
	{
		Random rand = new Random();

		effects.remove("Rusty");
		effects.remove("Feeble");

		weaponKey = getWeapon(rand.nextInt(weaponDmg.size()));		//gets weapon
		int effect = rand.nextInt(effects.size());		//gets effect

		System.out.println(effects.get(effect) + " " + weaponKey);
		wDescription(weaponKey);
		eDescription(effect);
		getEffectDamage(effect);
>>>>>>> Stashed changes
	}
	
	private static String getWeapon(int index)		//finds weapon in the HashMap
	{
		int i = 0;
		for(Map.Entry<String, Integer> entry : weaponDmg.entrySet())
		{
			if(index == i)
			{
				weaponKey = entry.getKey();		//sets weaponKey to key value of the entry
				damage = entry.getValue();		//sets damage to damage value of the entry
				break;
			}else{
				i++;
			}
		}
		return weaponKey;
	}

	public static void wDescription(String i)		//weapon descriptions
	{
		String description = "";

		switch(weaponKey.toUpperCase())
		{
		case "DAGGER":
			description = "A small double edged blade, could be useful.";
			break;
		case "SWORD":
			description = "A large double edged blade. You don't want to be on the pokey end of this.";
			break;
		case "KATANA":
			description = "A large curved blade. I can finally be a samurai!";
			break;
		case "RECURVE BOW":
			description = "A pretty basic bow but everything has to start somewhere.";
			break;
		case "CROSSBOW":
			description = "I wonder if Van Helsing ever used this one?";
			break;
		case "HALBERD":
			description = "Looks like a really long ax with a pokey bit at the top. How does somebody just leave this out here?";
			break;
		case "SPEAR":
			description = "It's a long stabbing stick";
			break;
		case "REVOLVER":
			description = "It's a gun that can only hold 6 bullets at a time but a skilled shooter can shoot all 6 in the blink of an eye and not miss a shot.";
			break;
		case "DOUBLE BARREL SHOTGUN":
			description = "A shotgun that can shoot 2 shells at a time but takes some time to before the next shot."
					+ " I feel like I should be yelling at some kids to get off my lawn.";
			break;
		case "NOVICE STAFF":
			description = "The first staff a learning mage ever gets. Pretty weak in the way of staves";
			break;
		case "INITIATE STAFF":
			description = "A staff given to a mage once they've proved their ability. Stronger than a novice staff.";
			break;
		case "GRAND MAGE STAFF":
			description = "A staff given to only the strongest and most talented mages. There is no staff stronger than a Grand Mage's staff.";
			break;
		case "NOVICE WAND":
			description = "It's a wizard's first magic stick. Do you really need a description?";
			break;
		case "INITIATE WAND":
			description = "This wand might've been owned by a famous hairy wizard, but nobody knows for sure.";
			break;
		case "GRAND WIZARD WAND":
			description = "The strongest wand a wizard can get; only 1 in every 10,000 wizards bceome a Grand Wizard.";
			break;
		case "WHIP":
			description = "Some braided bits of leather that if moved quick enough make a loud cracking sound. A favorite of archaelogists.";
			break;
		}
		System.out.println(description);
	}

	public static void eDescription(int j) 		//effect descriptions
	{
		String desc= "";
		switch(effects.get(j).toUpperCase())
		{
		case "RUSTY":
			desc = "+1 bleed damage";
			break;
		case "TOXIC":
			desc = "+3 poison damage";
			break;
		case "HOT":
			desc = "+2 burn damage";
			break;
		case "CHARGED":
			desc = "+3 lightning damage";
			break;
		case "FROSTY":
			desc = "+2 freeze damage ";
			break;
		case "STRIKER":
			desc = "+5 damage";
			break;
		case "FEEBLE":
			desc = "-2 damage";
			break;
		}
		System.out.println(effects.get(j) + ": " + desc);
	}

<<<<<<< Updated upstream
		System.out.println(effects.get(effect) + " " + weapons.get(weapon));
		wDescription(weapon);
		eDescription(effect);
	}
	public static void getDamage(int weapon)
	{
		 
	}
}
=======
	public static void getEffectDamage(int effect)		//calculates effect damage
	{
		switch(effects.get(effect).toUpperCase())
		{
		case "RUSTY":
			damage ++;	//+1 dmg
			break;
		case  "TOXIC":
			damage = damage + 3;	//+3 dmg
			break;
		case "HOT":		
			damage = damage + 2;	//+2 dmg
			break;
		case "CHARGED":
			damage = damage + 3;	//+3 dmg
			break;
		case "FROSTY":
			damage = damage + 2;	//+2 dmg
		case "STRIKER":
			damage = damage + 5;	//+5 dmg
			break;
		case "FEEBLE":
			damage = damage - 2;	//-2 dmg
			break;
		}
		System.out.println("Damage: " + damage);
	}//ends getEffectDamage method

}//ends class
>>>>>>> Stashed changes
