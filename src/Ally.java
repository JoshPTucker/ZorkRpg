
public class Ally extends Npc {
private boolean canHeal;
private boolean canHoldItem;
private boolean canAttkPlyr=false;
public Ally(String name, String type, int baseDamage, int baseHealth, int baseDefense, boolean canHeal,
			boolean canHoldItem) {
		super(name, type, baseDamage, baseHealth, baseDefense);
		// TODO Auto-generated constructor stub
		this.canHeal=canHeal;
		this.canHoldItem=canHoldItem;
	}
	public boolean isCanHeal() {
		return canHeal;
	}
	public void setCanHeal(boolean canHeal) {
		this.canHeal = canHeal;
	}
	public boolean isCanHoldItem() {
		return canHoldItem;
	}
	public void setCanHoldItem(boolean canHoldItem) {
		this.canHoldItem = canHoldItem;
	}
	public boolean getCanAttkPlyr() {
		return canAttkPlyr;
	}
}
