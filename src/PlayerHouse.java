import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;

public class PlayerHouse {
	static ArrayList<Room> playerHouse = new ArrayList<Room>();
	private static int numberOfRooms;
	static Random rn = new Random();

	public PlayerHouse(String areaName, String areaType, String description, int[][] size, int numberRooms) {

		// TODO Auto-generated constructor stub
		setNumberOfRooms(numberRooms);

	}

	public static void generatePlayerHouse(int numberRooms) {
		if (numberRooms >=6) {
			setNumberOfRooms(numberRooms);
			int i = 0;
			Room room = new Room();
			room.makeFoyer();
			playerHouse.add(room);
			while (i < numberRooms) {
				room.randomizeRooms(rn.nextInt(6) + 1);
				i++;
			}
		} else {
			setNumberOfRooms(6);
			int i = 0;
			Room room = new Room();
			room.makeFoyer();
			playerHouse.add(room);
			while (i < numberRooms) {
				room.randomizeRooms(rn.nextInt(6) + 1);
				i++;
			}
		}
	}

	public static String displayPlayerHouse() {
		return playerHouse.toString();
	}

	public static int getNumberOfRooms() {
		return numberOfRooms;
	}

	public static void setNumberOfRooms(int numberOfRooms) {
		PlayerHouse.numberOfRooms = numberOfRooms;
	}

}
