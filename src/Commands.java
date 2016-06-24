
public class Commands {
	private String action;
	private String object;
	public Commands(Player p,String action,String object){
		this.setAction(action);
		this.setObject(object);
	}
	public static void performAction( String action, String object){
		if(action.equals("attack")){
			attack(object);
		}
		else if(action.equals("move")){
			move();
		}
		else if (action.equals("take")){
			takeItem(object);
		}
	}
	
	public static String gameOver(){
		return "You have died\n Game Over";
	}
	
	public static void attack(String enemy){
		
	}
	public static void move(){
		
	}
	public static void takeItem(String item){
		
	}
	public static void dropItem(String item){
		
	}
	public static void equipItem(){
		
	}
	public static void unEquipItem(){
		
	}
	public static void displayHealth(){
		
	}

	public void showInventory(){
		
	}
	public void showVisited(){
		
	}
	public void showEnemieskilled(){
		
	}
	public void showDeaths(){
		
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
}
