package ca.sheridancollege.project;

/**
 * This class acts as base class and represents a player of game.
 * 
 * @author Daljeet Singh
 * @version 1.0
 */
public class Player {
    private String name;
    private int betChips;
    private GroupOfCards cardPack1;
    private GroupOfCards cardPack2;

    /**
     * Default no-arg constructor of class which initializes the two instances 
     * of class GroupOfCards.
     */
    public Player()
    {
        cardPack1 = new GroupOfCards();
        cardPack2 = new GroupOfCards();
    }

    /**
     * Get the name of player of the game.
     * 
     * @return A string representing the name of player.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of player of the game.
     * 
     * @param name A string representing the name of player.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the chips bet by player.
     * 
     * @return An integer representing the chips bet by player.
     */
    public int getBetChips() {
        return betChips;
    }

    /**
     * Set the chips for bet by player
     * 
     * @param betChips An integer representing the chips bet by player.
     */
    public void setBetChips(int betChips) {
        this.betChips = betChips;
    }
}
