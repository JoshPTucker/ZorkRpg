import java.util.Random;
public class MapGenerator {
	private int amountOfRooms;
	
	public  MapGenerator(int amtORooms){
		this.amountOfRooms=amtORooms;
	}

	public int getAmountOfRooms() {
		return amountOfRooms;
	}

	public void setAmountOfRooms(int amountOfRooms) {
		this.amountOfRooms = amountOfRooms;
	}
	
	public static void generateMap(){
	Random rand=new Random();
	}
}
