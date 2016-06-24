
public class Weapon extends Item {
private int dmgBuff;

//private int durability;
	public Weapon(String type, String name, boolean isHidden, boolean inInventory,
			int durability, int dmgBuff) {
		super(type, name, isHidden, inInventory, durability);
		// TODO Auto-generated constructor stub
		this.dmgBuff=dmgBuff;
		//this.durability=durability;
	}
	public int getDmgBuff() {
		return dmgBuff;
	}
	public void setDmgBuff(int dmgBuff) {
		this.dmgBuff = dmgBuff;
	}
//	public int getDurability() {
//		return durability;
//	}
//	public void setDurability(int durability) {
//		this.durability = durability;
//	}

}
