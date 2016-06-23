import java.util.Random;
public class WorldGenerator {
	private int amountOfRooms;
	
	public  WorldGenerator(int amtORooms){
		this.amountOfRooms=amtORooms;
	}

	public int getAmountOfRooms() {
		return amountOfRooms;
	}

	public void setAmountOfRooms(int amountOfRooms) {
		this.amountOfRooms = amountOfRooms;
	}
	
	public static void generateWorld(){
	Random rand=new Random();
	}
}
