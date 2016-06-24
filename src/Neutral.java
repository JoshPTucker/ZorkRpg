
public class Neutral extends Npc {
private boolean isVendor;
	public Neutral(String name, String type, int baseDamage, int baseHealth, int baseDefense,int charLevel,boolean isVendor) {
		super(name, type, baseDamage, baseHealth, baseDefense, charLevel);
		// TODO Auto-generated constructor stub
		this.isVendor=isVendor;
	}
	public boolean isVendor() {
		return isVendor;
	}
	public void setVendor(boolean isVendor) {
		this.isVendor = isVendor;
	}
	public void displayShop(){
		
	}
	public void setShop(){
		
	}
	public void sellItem(){
		
	}
	public void buyItems(){
		
	}
}
