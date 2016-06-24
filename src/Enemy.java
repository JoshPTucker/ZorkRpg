
public  class Enemy extends Npc{
private int spawnRate;
private boolean canAttkPlyr=true;
public  Enemy(String name, String type, int baseDamage, int baseHealth, int baseDefense,int charLevel) {
		super(name, type, baseDamage, baseHealth, baseDefense, charLevel);
		// TODO Auto-generated constructor stub
	}
	//Use a switch for selecting enemy types
	

	public int getSpawnRate() {
		return spawnRate;
	}
	public void setSpawnRate(int spawnRate) {
		this.spawnRate = spawnRate;
	}
	public void spawnEnemies(){
		
	}
	public boolean getCanAttkPlyr() {
		return canAttkPlyr;
	}
	
}
