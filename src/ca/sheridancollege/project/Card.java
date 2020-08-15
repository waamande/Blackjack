package ca.sheridancollege.project;

/**
 * This class represents a card from deck of playing cards.
 * 
 * @version 1.0
 */
   enum RANK
    {
        ACE(11,"Ace"),TWO(2,"Two"),THREE(3,"Three"),FOUR(4,"Four"),FIVE(5,"Five"),
        SIX(6,"Six"),SEVEN(7,"Seven"),Eight(8,"Eight"),NINE(9,"Nine"),TEN(10,"Ten"),
        JACK(10,"Jack"),QUEEN(10,"Queen"),KING(10,"King");
        public final int val;
        public final String rankText;
        RANK(int val,String rankText)
        {
            this.val=val;
            this.rankText=rankText;
        }
        public int getVal()
        {
            return val;
        }
        public String getRankText()
        {
            return rankText;
        }
    }
    enum SUIT
    {
    HEARTS("Heart"),
    SPADES("Spade"),
    DIAMONDS("Diamond"),
    CLUBS("Club");
    public final String suitText;
    SUIT(String suitText)
    {
        this.suitText=suitText;
    }
    public String getSuitText()
    {
      return suitText;
    }
    }
public class Card {
    private RANK rank;
    private SUIT suit;
    public Card(RANK rank, SUIT suit)
    {
        this.rank=rank;
        this.suit=suit;
    }
    public RANK getRank()
    {
        return rank;
    }
    public SUIT getSuit()
    {
        return suit;
    }
}
