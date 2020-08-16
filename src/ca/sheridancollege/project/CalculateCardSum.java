package ca.sheridancollege.project;


/**
 * This class +++Insert Description Here+++
 * 
 * @author Amandeep Singh Walia
 */
public class CalculateCardSum 
{
    public void calculateCardSum(GroupOfCards cardPack)
    {
        int size = cardPack.getCards().size();
        
        for(int i=cardPack.getCountForSum(); i<size; i++)
        {
            switch (cardPack.getCards().get(i).getValue()) 
            {
                case 11:
                    cardPack.setCardSum(10);
                    cardPack.getCards().get(i).setBlackjackCardValue(10);
                    break;
                case 12:
                    cardPack.setCardSum(10);
                    cardPack.getCards().get(i).setBlackjackCardValue(10);
                    break;
                case 13:
                    cardPack.setCardSum(10);
                    cardPack.getCards().get(i).setBlackjackCardValue(10);
                    break;
                case 14:
                    PlayerView view = new PlayerView();
                    int aceValue = view.getAceValue(i+1);
                    cardPack.setCardSum(aceValue);
                    cardPack.getCards().get(i).setBlackjackCardValue(aceValue);
                    break;
                default:
                    cardPack.setCardSum(cardPack.getCards().get(i).getValue());
                    cardPack.getCards().get(i).setBlackjackCardValue(cardPack.getCards().get(i).getValue());
                    break;
            }
            cardPack.setCountForSum(cardPack.getCountForSum() + 1);
        }  
        System.out.println("Card total: " + cardPack.getCardSum());
    }
}
