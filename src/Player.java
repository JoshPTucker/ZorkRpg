import java.util.HashMap;
import java.util.ArrayList;
public class Player extends Character{
	//private Object Player;
	private ArrayList<Item>inventory=new ArrayList<Item>();
	private HashMap<String, Integer> abilities=new HashMap<>();
	private int accountNum;
	public Player( String name, String species, int baseDamage, int baseHealth, int baseDefense,int charLevel,
					int account) {
		super(name, species, baseDamage, baseHealth, baseDefense,charLevel);
		// TODO Auto-generated constructor stub
		this.name=name;
		setAccountNum(account);
	}
	public HashMap<String, Integer> getAbilities() {
		return abilities;
	}
	public void setAbilities(HashMap<String, Integer> abilities) {
		this.abilities = abilities;
	}
	public ArrayList<Item> getInventory() {
		return inventory;
	}
	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
}
