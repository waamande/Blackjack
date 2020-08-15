package ca.sheridancollege.project;

/**
 * This class acts as base class and represents the Dealer.
 * 
 * @version 1.0
 */
public class Dealer {
    private String name;
    private GroupOfCards cardPack;
    private static Dealer dealer;

    /**
     * Default no-arg constructor which initializes the instance of class GroupOfCards.
     * The constructor has been implemented using singleton pattern. Thus, it is private.
     */
    private Dealer()
    {
        cardPack = new GroupOfCards();
    }

    /**
     * Get the name of Dealer.
     * 
     * @return A String representing the name of dealer.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of Dealer.
     * 
     * @param name A String representing the name of Dealer. 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Creates the only single instance of class Dealer.
     * 
     * @return An instance of class Dealer representing the dealer. 
     */
    public static Dealer getInstance() {
        if (dealer == null) {
            dealer = new Dealer();
        }
        return dealer;
    }
}
