
package ca.sheridancollege.project;

/**
 * This class adds and controls the logic for proper functioning of Dealer.
 * 
 * @version 1.0
 */
public class DealerController 
{
    public void createDealer(String name)
    {
        Dealer.getInstance().setName(name);
        
        CardGenerator generator = new CardGenerator();
        GroupOfCards cards = new GroupOfCards();
        
        cards.getCards().add(generator.cardGenerator());
        cards.getCards().add(generator.cardGenerator());
        
        Dealer.getInstance().setCardPack(cards);
    }
}
