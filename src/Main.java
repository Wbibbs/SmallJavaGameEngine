import java.util.Scanner;

public class Main {
	
	static Map m = new Map();
	static Player p = new Player("Player", 100);
	static Scanner sc = new Scanner(System.in);
	static Entity e = new Entity("NPC", 100);
	static Entity[][] EntityGrid = new Entity[10][10];//Same size as map grid
	public static void main(String[] args) throws Exception
	{
		startGame();
		boolean run = true;

		while (run)
		{
			System.out.println("Map printed");//Might be able to do with recursion
			getMovement();
			updateMap();
		}
	}

	public static void startGame()
	{
		m.makeMap();
		EntityGrid[4][4] = new Entity("Item", 10);
		m.updateMap(3, 3, 4);
		m.updateMap(4, 4, 10);
		m.updateMap(p.getYPos(), p.getXPos(), p.getPlayerNum());
		m.printMap();
	}

	public static void updateMap()
	{
		m.updateMap(p.getYPos(), p.getXPos(), p.getPlayerNum());
		m.printMap();
	}

	public static void getMovement()
	{
		/*int pX = p.getXPos();
		int pY = p.getYPos();

		m.updateMap(pY, pX, 1);*/
		m.updateMap(p.getYPos(), p.getXPos(), 1);
		System.out.println("XPos: " + p.getXPos() + "  YPos: " + p.getYPos());

		switch (sc.nextLine().toLowerCase())
		{
		case "w":
			if (m.map[p.getXPos()][p.getYPos() - 1] == 10)
			{
				System.out.println("You got " + EntityGrid[p.getXPos()][p.getYPos() - 1] + "!");
				p.addItem(new Item(EntityGrid[p.getXPos()][p.getYPos() - 1].getName(), "Description"));
				p.setPlayerNum(95);
				p.setYPos(-1);
			} else if (m.map[p.getXPos()][p.getYPos() - 1] == 1)
			{
				p.setPlayerNum(95);
				p.setYPos(-1);
			} else {
				System.out.println("There's something in the way!");
			}
			break;
		case "s":
			if (m.map[p.getXPos()][p.getYPos() + 1] == 10)
			{
				System.out.println("You got " + EntityGrid[p.getXPos()][p.getYPos() + 1] + "!");
				p.addItem(new Item(EntityGrid[p.getXPos()][p.getYPos() + 1].getName(), "Description"));
				p.setPlayerNum(96);
				p.setYPos(1);
			} else if (m.map[p.getXPos()][p.getYPos() + 1] == 1)
			{
				p.setPlayerNum(96);
				p.setYPos(1);
			} else{
				System.out.println("There's something in the way!");
			}
			break;
		case "a":
			if (m.map[p.getXPos() - 1][p.getYPos()] == 10)
			{
				System.out.println("You got " + EntityGrid[p.getXPos() - 1][p.getYPos()] + "!");
				p.addItem(new Item(EntityGrid[p.getXPos() - 1][p.getYPos()].getName(), "Description"));
				p.setPlayerNum(97);
				p.setXPos(-1);
			} else if (m.map[p.getXPos() - 1][p.getYPos()] == 1)
			{
				p.setPlayerNum(97);
				p.setXPos(-1);
			} else {
				System.out.println("There's something in the way!");
			}
			break;
		case "d":
			if (m.map[p.getXPos() + 1][p.getYPos()] == 10)
			{
				System.out.println("You got " + EntityGrid[p.getXPos() + 1][p.getYPos()] + "!");
				p.addItem(new Item(EntityGrid[p.getXPos() + 1][p.getYPos()].getName(), "Description"));
				p.setPlayerNum(98);
				p.setXPos(1);
			} else if (m.map[p.getXPos() + 1][p.getYPos()] == 1)
			{
				p.setPlayerNum(98);
				p.setXPos(1);
			} else {
				System.out.println("There's something in the way!");
			}
			break;
		case "t":
			/*int tempX = p.getXPos() + 1;
			int tempY = p.getYPos();//Inquire about an object at a specific area pointed to by the player character
			if (tempX == 3) {
				System.out.println(e.getName());
			} -- Uses two arrays, one to hold the map and another to hold entities*/
			if (p.getPlayerNum() == 95)
			{
				System.out.println("Player facing up");
				System.out.println(EntityGrid[p.getXPos()][p.getYPos() - 1]);
			} else if (p.getPlayerNum() == 96)
			{
				System.out.println("Player facing down");
				System.out.println(EntityGrid[p.getXPos()][p.getYPos() + 1]);
			} else if (p.getPlayerNum() == 97)
			{
				System.out.println("Player facing left");
				System.out.println(EntityGrid[p.getXPos() - 1][p.getYPos()]);
			} else if (p.getPlayerNum() == 98)
			{
				System.out.println("Player facing right");
				System.out.println(EntityGrid[p.getXPos() + 1][p.getYPos()]);
			}
			break;
		}
	}
}
