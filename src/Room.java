
public class Room extends Area {

	public Room(String areaName, String areaType, String description, int[][] coordinates) {
		super(areaName, areaType, description, coordinates);
		// TODO Auto-generated constructor stub
	}
	public Room(){
		
	}
	public void randomizeRooms(int x){
		
		switch(x) {
		case 1:makeDungeon();
		break;
		case 2:makeSecretRoom();
		break;
		case 3:makeKitchen();
		break;
		case 4:makeLibrary();
		break;
		case 5:makeBedroom();
		break;
		case 6:makeHallway();
		break;
		default:makeFoyer();
		break;
		}
	}
	public void makeFoyer(){
		setAreaName("Foyer");
		setDescription("Beautiful foyer");
		setAreaType("room");
		populateEnemies();
		populateItems();
	}
	public void makeDungeon(){
		setAreaName("Dungeon");
		setDescription("Cold scary dungeon");
		setAreaType("room");
		populateEnemies();
		populateItems();
	}
	public void makeSecretRoom(){
		setAreaName("Secret Room");
		setDescription("dark secret room ");
		setAreaType("room");
		populateEnemies();
		populateItems();
	}
	public void makeKitchen(){
		setAreaName("Kitchen");
		setDescription("messy kitchen ");
		setAreaType("room");
		populateEnemies();
		populateItems();
	}
	public void makeLibrary(){
		setAreaName("Library");
		setDescription("books are strewn about ");
		setAreaType("room");
		populateEnemies();
		populateItems();
	}
	public void makeBedroom(){
		setAreaName("Bedroom");
		setDescription("bed is messed");
		setAreaType("room");
		populateEnemies();
		populateItems();
	}
	public void makeHallway(){
		setAreaName("Hallway");
		setDescription("Long hallway");
		setAreaType("room");
		populateEnemies();
		populateItems();
	}
}
