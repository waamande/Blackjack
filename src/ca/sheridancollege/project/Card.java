package ca.sheridancollege.project;

/**
 * This class represents a card from deck of playing cards.
 * 
 * @version 1.0
 */
public class Card 
{
    private int value;
    private int blackjackCardValue;

    
    public int getValue() 
    {
        return value;
    }
    
    
    public void setValue(int value) 
    {
        this.value = value;
    }

    public int getBlackjackCardValue() {
        return blackjackCardValue;
    }

    public void setBlackjackCardValue(int blackjackCardValue) {
        this.blackjackCardValue = blackjackCardValue;
    }
    
    
}
