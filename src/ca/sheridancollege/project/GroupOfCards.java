
package ca.sheridancollege.project;
import java.util.*;

/**
 * This class represents the hand which is group of cards given to person for
 * playing the game.
 * 
 * @version 1.0
 */
public class GroupOfCards 
{
    private ArrayList<Card> cards = null;
    private int cardSum = 0;
    private int countForSum = 0;

    
    public GroupOfCards()
    {
        cards =  new ArrayList<Card>();
    }

    
    public int getCardSum() 
    {
        return cardSum;
    }

   
    public void setCardSum(int cardSum) 
    {
        this.cardSum += cardSum;
    }
    
    public ArrayList<Card> getCards() 
    {
        return cards;
    }   
    
    public int getCountForSum() 
    {
        return countForSum;
    }

    public void setCountForSum(int countForSum) 
    {
        this.countForSum = countForSum;
    }

    
    
}
