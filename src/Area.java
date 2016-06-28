import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;

public abstract class Area {
	//North, South, East, West, Up, Down
	private String[]exits=new String[6];
	private String areaName;
	private String areaType;
	private String description;
	//private itemlist
	//private enemy list
	private int[][] coordinates;
	boolean isVisited;
	public Area(String areaName, String areaType, String description, int[][] coordinates){
		
	}
	public Area(){
		
	}
	public String[] getExits() {
		return exits;
	}
	public void setExits(String[] exits) {
		this.exits = exits;
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
	public void populateEnemies(){
		
	}
	public void populateItems(){
		
	}
	public int[][] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(int[][] coordinates) {
		this.coordinates = coordinates;
	}
}
