package ca.sheridancollege.project;

/**
 * This class acts as base class and represents the Dealer.
 * 
 * @version 1.0
 */
public class Dealer 
{
    private String name;
    private GroupOfCards cardPack;
    private static Dealer dealer;

   
    private Dealer()
    {
        cardPack = new GroupOfCards();
    }

    
    public String getName() 
    {
        return name;
    }
    
   
    public void setName(String name) 
    {
        this.name = name;
    }

  
    public static Dealer getInstance() {
        if (dealer == null) {
            dealer = new Dealer();
        }
        return dealer;
    }

    public GroupOfCards getCardPack() 
    {
        return cardPack;
    }

    public void setCardPack(GroupOfCards cardPack) 
    {
        this.cardPack = cardPack;
    }
    
    
}
