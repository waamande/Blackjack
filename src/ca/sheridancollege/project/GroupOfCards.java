
package ca.sheridancollege.project;
import java.util.*;

/**
 *
 * @author singh
 */
public class GroupOfCards {
    private ArrayList<Card> cards;
    int cardSum;

    public GroupOfCards()
    {
        cards =  new ArrayList<Card>();
    }

    public int getCardSum() {
        return cardSum;
    }

    public void setCardSum(int cardSum) {
        this.cardSum = cardSum;
    }

    //public Card cardGenerator()
    //public void playerCardComparison()
    //public void dealerCardComparison()
    //publcic String toString()
}
