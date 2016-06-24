
public class Armor extends Item{
	private int deffBuff;
	//private int durability;
	public Armor(String type, String name, boolean isHidden, boolean inInventory, int durability,int deffBuff ) {
		super(type, name, isHidden, inInventory, durability);
		// TODO Auto-generated constructor stub
		//this.durability=durability;
		this.deffBuff=deffBuff;
	}
	public int getDeffBuff() {
		return deffBuff;
	}
	public void setDeffBuff(int deffBuff) {
		this.deffBuff = deffBuff;
	}
//	public int getDurability() {
//		return durability;
//	}
//	public void setDurability(int durability) {
//		this.durability = durability;
//	}
}
