package resources;

public class Map {

	private int x;
	private int y;
	private String[][] mapArray;
	
	Map(int x, int y){
		this.x = x;
		this.y = y;
		makeMap();
	}
	
	void makeMap() {
		mapArray = new String[x][y]; 
		
		for (int i = 0; i < x; i++) {
			for (int n = 0; n < y; n++) {
				mapArray[x][y] = "*";
			}
		}
	}
	
	void printMap() {
		
		for (int i = 0; i < x; i++) {
			for (int n = 0; n < y; n++) {
				System.out.println(mapArray[x][y]);
			}
		}
	}
	
	void addEvent(int x, int xmax, int y, int ymax, String c) {//Reads in an x value to start, an x value to end, y to start and end, and the character it will replace those values with
	//Ex: Want to replace x 2 - 5 and y 2 - 4 with & -- addEvent(2, 5, 2, 4, &);
		for (int i = x; i < xmax; i++) {
			for (int n = y; n < ymax; n++) {
				mapArray[x][y] = c;
			}
		}
	}
}
