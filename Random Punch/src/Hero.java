
/*
 * The Hero class represents one of the two Players in this game. 
 * As shown below,Hero is a subclass of Player.
 */
public class Hero extends Player {
	
	//Instance Variables
	
	private int healthBoost = 300; //this variable is used in this class'
	//specialMove() method. Like the name suggests, it will boost the health
	//of the Hero.
	
	//Constructor
	public Hero (String name, int strength) {
		
		super (name, strength);
		
	}
	
	//Methods
	
	@Override
	/*
	 * We will override the specialMove() method in the Player class. The
	 * specialMove() method of the Hero class will boost a Hero's health by
	 * 200.
	 */
	public void specialMove() {
		System.out.println(getName() + " is now doing there special move. "
				+ "They will increase their health by 300.");
		boostHealth(healthBoost);
		super.specialMove(); //decrements the amount of special moves left
		System.out.println(getName() + " has completed their special move."
				+ "They now have " + getNumSpecialMoves() + " remaining");
	}

}
