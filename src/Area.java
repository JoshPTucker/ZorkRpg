
public abstract class Area {
	private String[]exits=new String[4];
	private String areaName;
	private String areaType;
	private String description;
	private int[][] size;
	public Area(String areaName, String areaType, String description, int[][] size){
		
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
}
