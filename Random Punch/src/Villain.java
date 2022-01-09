
/*
 * The Villain class represents another Player in this game, which is the
 * Villain. The Villain class is a subclass of the Player class.
 */
public class Villain extends Player {
	
	//Constructor
	public Villain (String name, int strength) {
		
		super(name, strength);
	}
	
	//Methods
	
	@Override
	/*
	 * specialMove() method of the Villain class, which overrides that of the 
	 * Player class. A Villain's specialMove is that they can increase their
	 * strength by +50.
	 */
	public void specialMove() {
		
		System.out.println(getName() + " is now doing there special move. "
				+ "They will increase their strength by 50.");
		boostStrength(50);
		super.specialMove(); //decrements the amount of special moves left
		System.out.println(getName() + " has completed their special move."
				+ "They now have " + getNumSpecialMoves() + " remaining");
		
	}

}
