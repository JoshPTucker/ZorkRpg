import java.util.Scanner;
import java.util.Random;


public class GameManager {
	//
	static Random rand=new Random();
	static Scanner keyboard=new Scanner(System.in);
	String action;
	public GameManager(){
		
	}
	
	public static void printWelcome(){
		System.out.println("Welcome to Zork"
				+ "\nWould youlike to play a game?");
	}
	
	public static void startGame(){
	System.out.println("Your game has started");
	GameManager.createChar();
	System.out.println("Please wait while your map is"
			+ " being randomly generated");
	WorldGenerator.generateWorld();
	System.out.println("How many rooms would you like your house to have?");
	int amtRooms=keyboard.nextInt();
	PlayerHouse.generatePlayerHouse(amtRooms);
//	System.out.println("Your house has been generated");
//	System.out.println(PlayerHouse.displayPlayerHouse());
	}
	public void playGame(){
		
	}
	public static void printValidActions(){
		System.out.println("Valid actions: attack, look, "
				+ "\ngo, leave, take, pickup");
	}
	//saves game state
	public static void saveGame(){
		
	}
	//Creates char
	private static void createChar(){
		System.out.println("Enter your characters name");
		String name=keyboard.nextLine();
		//System.out.println("Enter CHaracter race");
		//String race=Keyboard.next();
		int account=rand.nextInt();
		Player p=new Player( name, "Human", 50, 100, 0,1, account);
		System.out.println("Your name is "+p.getName());
		System.out.println("You are a "+p.getSpecies());
		System.out.println("Current level : "+p.getCharLevel());

		
//		System.out.println("Is your name correct?");
//		String answer=keyboard.next();
//		if(answer.toLowerCase().equals("yes")){
//			System.out.println("Enjoy");
//		}
//		if(answer.toLowerCase().equals("no")){
//			System.out.println("Enter new name");
//			String nameChange=keyboard.nextLine();
//			p.setName(nameChange);
//		}
	}
	private static void runCombatEngine(){
		CombatEngine.initCombat();
		CombatEngine.runCombat();
		CombatEngine.printCombatResult();
	}
}
