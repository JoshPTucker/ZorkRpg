import java.util.Random;
public class Room extends Area {

	public Room(String areaName, String areaType, String description, int[][] coordinates) {
		super(areaName, areaType, description, coordinates);
		// TODO Auto-generated constructor stub
	}
	public Room(){
		
	}
	Random rand=new Random();
	public void randomizeRooms(){
		int x = 0;
		int rn=rand.nextInt(99)+1;
		if (rn>=98){
			x=2;
		}else if (rn<98&&rn>=94){
			x=1;
		}else if (rn<=20){
			x=3;
		}else if (rn>20&&rn<=30){
			x=4;
		}else if (rn>30&&rn<=60){
			x=6;
		}else if (rn>60&&rn<80){
			x=5;
		}else if (rn<90&&rn>=80){
			x=7;
		}else if (rn<94&&rn>=90){
			x=8;
		}
		
		
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
		case 7:makeParlor();
		break;
		case 8: makeVault();
		break;
		default:makeFoyer();
		break;
		}
	}
	//one per house
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
	public void makeParlor(){
		setAreaName("Parlor");
		setDescription("Spatious parlor");
		setAreaType("room");
		populateEnemies();
		populateItems();
	}
	public void makeVault(){
		setAreaName("Vault");
		setDescription("Vault with piles of gold");
		setAreaType("room");
		populateEnemies();
		populateItems();
	}
	
}
