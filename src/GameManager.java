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
	System.out.println("Please wait while your map is"
			+ " being randomly generated");
	MapGenerator.generateMap();
	System.out.println("Your map has been generated");
	GameManager.printValidActions();
	GameManager.createChar();
	}
	public void playGame(){
		
	}
	public static void printValidActions(){
		System.out.println("Valid actions: attack, look, "
				+ "\ngo, leave, take, pickup");
	}
	public static void saveGame(){
		
	}
	private static void createChar(){
		System.out.println("Enter your characters name");
		String name=keyboard.next();
		//System.out.println("Enter CHaracter race");
		//String race=Keyboard.next();
		Player p=new Player(name, "human", 50, 100, 0);
		p.printCharData();
	}
}
