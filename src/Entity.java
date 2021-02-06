
public class Entity {

	private String name;
	private int health;
	private int yPos = 3;
	private int xPos = 3;
	
	public Entity(String name, int health)
	{
		this.name = name;
		this.health = health;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void setHealth(int health)
	{
		this.health -= health;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toSring()
	{
		return name + " - HP: " + health;
	}
}
