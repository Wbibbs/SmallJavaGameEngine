//Remake map to update in a GUI window that represents the console, but flawlessly
//updates the graphics to flow a lot smoother
public class Map {

	private int length = 10;
	private int width = 10;
	int map[][] = new int[length][width];
	private int playerU = 95; // Player int for up
	private int playerD = 96; // Player int for down
	private int playerL = 97; // Player int for left
	private int playerR = 98; // Player int for right
	private int enemy = 2;
	private int wall = 3;
	private int npc = 4;

	public void printMap()
	{
		for (int i = 0; i < length; i ++)
		{
			for (int n = 0; n < width; n++)
			{
				switch (map[i][n]){
				case 1:
					System.out.print("*");
					break;
				case 2: 
					System.out.print("E");
					break;
				case 3: 
					System.out.print("W");
					break;
				case 4:
					System.out.print("N");
					break;
				case 10:
					System.out.print("%");
					break;
				case 95: 
					System.out.print("^");
					break;
				case 96: 
					System.out.print("v");
					break;
				case 97: 
					System.out.print("<");
					break;
				case 98: 
					System.out.print(">");
					break;
				}
				
				if (!(n == width - 1)) 
				{
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}

	public void makeMap()
	{
		for (int i = 0; i < length; i ++)
		{
			for (int n = 0; n < width; n++)
			{
				map[i][n] = 1;
			}
		}
	}

	public void updateMap(int x, int y, int place)
	{
		map[x][y] = place;
	}
	
	public int[][] getMap()
	{
		return map;
	}
	
	public void barrier(int x, int y)
	{
		
	}
}
