
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
    private Random random = new Random();

    /**
     * Default no-arg constructor which initializes the array list of class GroupOfCards.
     */
    public GroupOfCards()
    {
        cards =  new ArrayList<Card>();
        Card card1 = new Card(RANK.values()[random.nextInt(13)],SUIT.values()[random.nextInt(13)]);
        cards.add(card1);
        Card card2 = new Card(RANK.values()[random.nextInt(13)],SUIT.values()[random.nextInt(13)]);
        cards.add(card2);
    }

    /**
     * Gets the sum of values of cards.
     * 
     * @return An integer representing the sum of values of cards. 
     */
    public int getCardSum() {
        Card[] array = new Card[10];
        cards.toArray(array);
        cardSum=0;
        for(int i=0;i<array.length;i++)
        {
            RANK rank= array[i].getRank();
            cardSum = rank.getVal();
        }
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

    public Card cardGenerator()
    {
        Card card = new Card(RANK.values()[random.nextInt(13)],SUIT.values()[random.nextInt(13)]);
        cards.add(card);
        return card;
    }
    //public void playerCardComparison()
    //public void dealerCardComparison()
    //publcic String toString()
    public void display()
    {
        int i=1;
        for(Card a: cards)
        {
            System.out.println("Card "+i+": "+a.getRank().getRankText()+" of "+a.getSuit().getSuitText());
        }
    }
}
