
/*
 * This is the Player class, which represents a Player in our game. In this
 * game, two Players (one being a Hero and one being a Villain) will compete
 * against one another. The Player class is a superclass of Hero and Villain.
 * It contains methods that will be either overridden or utilized by other 
 * classes in this project.
 */
public class Player {
	
	//Instance Variables
	
	private String name; //name of the Player
	private int health = 1000; //Each Player has a starting health of 1000.
	private int numSpecialMoves = 2; //Each Player is able to use two special
									 //moves.
	private int strength; //Represents the strength of each Player. This means
	//that whenever they land a punch on another Player, the attacked Player's
	//health will decrease by the strength of the Player that landed the 
	//attack
	
	
	//Constructor
	
	public Player (String name, int strength) {
		
		this.name = name;
		this.strength = strength;
	}
	
	//Methods
	
	//Accessor Methods
	
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public int getNumSpecialMoves() {
		return numSpecialMoves;
	}
	
	//Fighting Methods
	
	/*
	 * The punch() method enables the current Player to land an attack on 
	 * the 'opponent' Player. As explained earlier, this will reduce the health
	 * of the 'opponent' Player by the current Player's 'strength'
	 */
	public void punch (Player opponent) {
		
		opponent.health -= strength;
		System.out.println(name + " just punched " + opponent.name);
		System.out.println("Now, " + opponent.name + "'s health is " + 
		opponent.health );
	}
	
	/*
	 * specialMove() method, which will be overridden by the subclasses of
	 * Player, which are Hero and Villain. The Player class implementation 
	 * of this method will simply deduct the number of special moves remaining.
	 */
	public void specialMove() {
		
		numSpecialMoves--;
	}
	
	
	/*
	 * The boostHealth(int) method will increase the health of a Player
	 * by the 'boost' parameter. This method will be used in the Hero class,
	 * more specifically, the specialMove() method in the Hero class.
	 */
	public void boostHealth(int boost) {
		health += boost;
	}
	
	/*
	 * boostStrength() method will increase the strength of a Player by 'boost'.
	 * This method will be used in the specialMove() method of the Villain
	 * class.
	 */
	public void boostStrength(int boost) {
		
		strength += boost;
	}
	
	/*
	 * toString() method that returns a string representation of a Player
	 */
	public String toString() {
		return "Name: " + name + " Strength: " + strength;
	}
	
	
	

}
