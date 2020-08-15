package ca.sheridancollege.project;

/**
 * This class represents a card from deck of playing cards.
 * 
 * @version 1.0
 */
public class Card {
    private int value;

    /**
     * Gets the value of card.
     * 
     * @return An integer representing the value of card.  
     */
    public int getValue() {
        return value;
    }
    
    /**
     * Sets the value of card.
     * 
     * @param value An integer representing the value of card. 
     */
    public void setValue(int value) {
        this.value = value;
    }
}
