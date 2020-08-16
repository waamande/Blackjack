package ca.sheridancollege.project;

/**
 * This class acts as base class and represents a player of game.
 * 
 * @author Daljeet Singh
 * @version 1.0
 */
public class Player 
{
    private String name;
    private int betChips;
    private GroupOfCards cardPack1;
    private GroupOfCards cardPack2;
    private boolean split = false;

   
    public Player()
    {
        cardPack1 = new GroupOfCards();
        cardPack2 = new GroupOfCards();
    }

   
    public String getName() 
    {
        return name;
    }

    
    public void setName(String name) 
    {
        this.name = name;
    }

    public int getBetChips() 
    {
        return betChips;
    }

    public void setBetChips(int betChips) 
    {
        this.betChips = betChips;
    }

    public boolean isSplit() 
    {
        return split;
    }

    public void setSplit(boolean split) 
    {
        this.split = split;
    }

   
    public GroupOfCards getCardPack1() 
    {
        return cardPack1;
    }

    public void setCardPack1(GroupOfCards cardPack1) 
    {
        this.cardPack1 = cardPack1;
    }

    public GroupOfCards getCardPack2() 
    {
        return cardPack2;
    }
}
