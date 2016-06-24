
public abstract class Character {
	
	protected String name;
	private int baseDamage;
	private int baseHealth;
	private int charLevel;
	private String species;
	private int baseDefense;
	private boolean canAttack=true;
	private boolean isAlive=true;
	private int location;
	private int experience;

	public Character(String name, String species, int baseDamage, int baseHealth, int baseDefense,int charLevel) {
		this.name=name;
		this.baseDamage = baseDamage;
		this.baseHealth = baseHealth;
		this.species = species;
		this.baseDefense=baseDefense;
	}

	public  int getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}

	public int getBaseHealth() {
		return baseHealth;
	}

	public void setBaseHealth(int baseHealth) {
		this.baseHealth = baseHealth;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String type) {
		this.species = type;
	}
	public int getBaseDefense() {
		return baseDefense;
	}

	public void setBaseDefense(int baseDefense) {
		this.baseDefense = baseDefense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public static void attack(String enemy){
		
	}

	public boolean isCanAttack() {
		return canAttack;
	}

	public void setCanAttack(boolean canAttack) {
		this.canAttack = canAttack;
	}
	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}
	public static String printDeathMsg(String name){
		
		return name+"Has died";
		
	}
	public  String getCharData(){
		return "Name: "+name+"\nDamage: "+baseDamage
				+ "\nHealth: "+ baseHealth;
	}

	public int getCharLevel() {
		return charLevel;
	}

	public void setCharLevel(int charLevel) {
		this.charLevel = charLevel;
	}

	public int getExperience() {
		return experience;
	}

	public  void setExperience(int experience) {
	 this.experience = experience;
	}
	public static void respawn(){
		
	}
}

