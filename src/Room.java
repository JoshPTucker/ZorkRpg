
public abstract class Room {
	private String[]exits=new String[4]; 
	public Room(){
		
	}
	public String[] getExits() {
		return exits;
	}
	public void setExits(String[] exits) {
		this.exits = exits;
	}
}
