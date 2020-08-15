
package ca.sheridancollege.project;
import java.util.*;

/**
 * This class represents the hand which is group of cards given to person for
 * playing the game.
 * 
 * @version 1.0
 */
public class GroupOfCards {
    private ArrayList<Card> cards;
    int cardSum;

    /**
     * Default no-arg constructor which initializes the array list of class GroupOfCards.
     */
    public GroupOfCards()
    {
        cards =  new ArrayList<Card>();
    }

    /**
     * Gets the sum of values of cards.
     * 
     * @return An integer representing the sum of values of cards. 
     */
    public int getCardSum() {
        return cardSum;
    }

    /**
     * Sets the sum of value of cards.
     * 
     * @param cardSum An integer representing the sum of values of cards. 
     */
    public void setCardSum(int cardSum) {
        this.cardSum = cardSum;
    }

    //public Card cardGenerator()
    //public void playerCardComparison()
    //public void dealerCardComparison()
    //publcic String toString()
}
