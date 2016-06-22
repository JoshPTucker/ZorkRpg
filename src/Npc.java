
public class Npc extends Character {
	private String voiceLine;
	private boolean canAttkPlyr;
	private boolean isImmune;
	public Npc(String name, String type, int baseDamage, int baseHealth,int baseDefense){
		super(name, type, baseDamage, baseHealth, baseDefense);
		// TODO Auto-generated constructor stub
		//this.voiceLine=voiceLine;
	}
	public String getVoiceLine() {
		return voiceLine;
	}
	public void setVoiceLine(String voiceLine) {
		this.voiceLine = voiceLine;
	}
	public boolean getCanAttkPlyr() {
		return canAttkPlyr;
	}
	public void setCanAttkPlyr(boolean canAttkPlyr) {
		this.canAttkPlyr = canAttkPlyr;
	}
	public boolean getIsImmune() {
		return isImmune;
	}
	public void setImmune(boolean isImmune) {
		this.isImmune = isImmune;
	}

}
