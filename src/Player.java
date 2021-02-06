import java.util.ArrayList;

public class Player extends Entity{

	private LinkedList inventory = new LinkedList();
	private int inventorySize = 2;
	private int playerNum = 95;		//current position of player
	private int yPos = 0;			//vertical position
	private int xPos = 0;			//horizontal position
	
	public Player(String name, int health) 
	{
		super(name, health);
	}

	public void addItem(Item i)
	{
		if (inventory.size() >= inventorySize)		//player inventory compare to player inventory size
		{
			System.out.println("Inventory too full, discarding item.");
		} else
			inventory.add(i);		//adds item to player inventory
	}
	
	public void setPlayerNum(int playerNum)			//
	{
		this.playerNum = playerNum;
	}
	
	public void setYPos(int yPos)
	{
		this.yPos += yPos;
	}
	
	public void setXPos(int xPos)
	{
		this.xPos += xPos;
	}
	
	public int getXPos()
	{
		return xPos;
	}
	
	public int getYPos()
	{
		return yPos;
	}
	
	public int getPlayerNum()
	{
		return playerNum;
	}
}
