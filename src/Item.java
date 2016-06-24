import java.util.HashMap;
import java.util.ArrayList;
public abstract class Item {
	private String type;
	private String name;
	private boolean isHidden;
	private boolean inInventory;
	private int durability;
	public Item(String type, String name,boolean isHidden, boolean inInventory,int durability){
	this.name=name;
	this.type=type;
	this.isHidden=isHidden;
	this.inInventory=inInventory;
	this.durability=durability;
}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHidden() {
		return isHidden;
	}

	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}

	public boolean isInInventory() {
		return inInventory;
	}

	public void setInInventory(boolean inInventory) {
		this.inInventory = inInventory;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}
	public void generateItems(){
		
	}
}
