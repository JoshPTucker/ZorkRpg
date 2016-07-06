import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;

public class PlayerHouse {
	static ArrayList<Room> playerHouse = new ArrayList<Room>();
	private static int numberOfRooms;
	// static Random rn = new Random();

	public PlayerHouse(String areaName, String areaType, String description, int[][] size) {

		// TODO Auto-generated constructor stub

	}

	public static void generatePlayerHouse(int numberRooms) {
		numberRooms=numberRooms-1;
		if (numberRooms >= 6) {
			setNumberOfRooms(numberRooms);
			int i = 0;
			Room room = new Room();
			room.makeFoyer();
			room.setxCoord(0);
			room.setyCoord(0);
			playerHouse.add(room);

			while (i < numberRooms) {
				Room room1 = new Room();
				room1.randomizeRooms();
				playerHouse.add(room1);
				i++;
			}
		} else {
			setNumberOfRooms(6);
			numberRooms=6;
			int i = 0;
			Room room = new Room();
			room.makeFoyer();
			room.setxCoord(0);
			room.setyCoord(0);
			playerHouse.add(room);
			while (i < numberRooms) {
				Room room1 = new Room();
				room1.randomizeRooms();
				playerHouse.add(room1);
				i++;
			}
		}
	}

	public static String displayPlayerHouse() {
		String HouseList = "";
		for (int i = 0; i < playerHouse.size(); i++) {
			HouseList +="\n"+ playerHouse.get(i).getAreaName();
		}
		return HouseList;
	}

	public static int getNumberOfRooms() {
		return numberOfRooms;
	}

	public static void setNumberOfRooms(int numberOfRooms) {
		PlayerHouse.numberOfRooms = numberOfRooms;
	}

}
