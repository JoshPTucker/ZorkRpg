
public abstract class Character {
	
	private String name;
	private int baseDamage;
	private int baseHealth;
	private String type;
	private int baseDefense;
	private boolean canAttack=true;
	private boolean isAlive=true;
	private int location;
	

	public Character(String name, String type, int baseDamage, int baseHealth, int baseDefense) {
		this.name=name;
		this.baseDamage = baseDamage;
		this.baseHealth = baseHealth;
		this.type = type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	public void attack(){
		
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
	public void death(){
		System.out.println(name+" "+type+"has died");
	}
	public void printCharData(){
		System.out.println("Name: "+name+"\nDamage: "+baseDamage
				+ "\nHealth: "+ baseHealth);
	}
}
