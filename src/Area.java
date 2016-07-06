import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;

public abstract class Area {
	//North, South, East, West, Up, Down
	private HashMap<String,Integer>exits=new HashMap<String,Integer>() ;
	private String areaName;
	private String areaType;
	private String description;
	private ArrayList<Enemy> enemies=new ArrayList<Enemy>();
	private ArrayList<Item> items=new ArrayList<Item>();
	private int xCoord;
	private int yCoord;

	
	boolean isVisited;
	public Area(String areaName, String areaType, String description, int xCoord,int yCoord){
		exits.put("north", -1);
		exits.put("south", -1);
		exits.put("east", -1);
		exits.put("west", -1);
		exits.put("up", -1);
		exits.put("down", -1);
	}
	public Area(){
		
	}
	
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getAreaType() {
		return areaType;
	}
	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void populateEnemies(Object Enemy){
		
	}
	public void populateItems(Object Items){
		
	}
	public HashMap<String,Integer> getExits() {
		return exits;
	}
	public void setExits(HashMap<String,Integer> exits) {
		this.exits = exits;
	}
	public ArrayList<Enemy> getEnemies() {
		return enemies;
	}
	public void setEnemies(ArrayList<Enemy> enemies) {
		this.enemies = enemies;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public int getxCoord() {
		return xCoord;
	}
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}
	public int getyCoord() {
		return yCoord;
	}
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}
}
