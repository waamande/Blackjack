package ca.sheridancollege.project;

/**
 * This class represents and handles the game.
 * 
 * @version 1.0
 */
public class Game 
{
    public void declarePlayerWinner(int num, int winType, GroupOfCards cardPack)
    { 
        int size = cardPack.getCards().size();
        System.out.println();
        if(winType == 1)
        {
            System.out.println("Player " + BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getName() + " wins game with blackjack with the cards of ");
            for(int i=0; i<size; i++)
            {
                switch(cardPack.getCards().get(i).getValue())
                {
                    case 11:
                        System.out.print("King ");
                        break;
                    case 12:
                        System.out.print("Queen ");
                        break;
                    case 13:
                        System.out.print("Jack ");
                        break;
                    case 14:
                        System.out.print("Ace ");
                        break;
                    default:
                        System.out.print(cardPack.getCards().get(i).getValue() + " ");
                        break;
                }
            }
            System.out.println("\n");
            System.out.println("Score: " + (BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getBetChips()*3)/2);
        }
        else if(winType == 2)
        {
            System.out.println("Player " + BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getName() + " wins game with the cards of ");
            for(int i=0; i<size; i++)
            {
                switch(cardPack.getCards().get(i).getValue())
                {
                    case 11:
                        System.out.print("King ");
                        break;
                    case 12:
                        System.out.print("Queen ");
                        break;
                    case 13:
                        System.out.print("Jack ");
                        break;
                    case 14:
                        System.out.print("Ace ");
                        break;
                    default:
                        System.out.print(cardPack.getCards().get(i).getValue() + " ");
                        break;
                }
            }
            System.out.println("\n");
            System.out.println("Score: " + (BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getBetChips()*2));
        }
    }
    
    
    
    
    public void declarePlayerLoser(int num, GroupOfCards cardPack)
    {
        int size = cardPack.getCards().size();
        System.out.println();
        System.out.print("Player " + BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getName() + " loses the game with the cards of ");
        for(int i=0; i<size; i++)
        {
            switch(cardPack.getCards().get(i).getValue())
            {
                case 11:
                    System.out.print("King ");
                    break;
                case 12:
                    System.out.print("Queen ");
                    break;
                case 13:
                    System.out.print("Jack ");
                    break;
                case 14:
                    System.out.print("Ace ");
                    break;
                default:
                    System.out.print(cardPack.getCards().get(i).getValue() + " ");
                    break;
            }
        }
        System.out.println("\n");
    }
    
    
    
    
    public void declareDealerWinner(int winType)
    {
        int size = Dealer.getInstance().getCardPack().getCards().size();
        System.out.println();
        if(winType == 1)
        {
            System.out.print("Dealer " + Dealer.getInstance().getName() + " wins game with blackjack with the cards of ");
            for(int i=0; i<size; i++)
            {
                switch(Dealer.getInstance().getCardPack().getCards().get(i).getValue())
                {
                    case 11:
                        System.out.print("King ");
                        break;
                    case 12:
                        System.out.print("Queen ");
                        break;
                    case 13:
                        System.out.print("Jack ");
                        break;
                    case 14:
                        System.out.print("Ace ");
                        break;
                    default:
                        System.out.print(Dealer.getInstance().getCardPack().getCards().get(i).getValue() + " ");
                        break;
                }
            }
            System.out.println("\n");
        }
        else if(winType == 2)
        {
            System.out.print("Dealer " + Dealer.getInstance().getName() + " wins game with the cards of ");
            for(int i=0; i<size; i++)
            {
                switch(Dealer.getInstance().getCardPack().getCards().get(i).getValue())
                {
                    case 11:
                        System.out.print("King ");
                        break;
                    case 12:
                        System.out.print("Queen ");
                        break;
                    case 13:
                        System.out.print("Jack ");
                        break;
                    case 14:
                        System.out.print("Ace ");
                        break;
                    default:
                        System.out.print(Dealer.getInstance().getCardPack().getCards().get(i).getValue() + " ");
                        break;
                }
            }
            System.out.println("\n");
        }
    }
    
    
    
    
    public void declareDealerLoser()
    {
        int size = Dealer.getInstance().getCardPack().getCards().size();
        System.out.println();
        System.out.print("Dealer " + Dealer.getInstance().getName() + " loses the game with the cards of ");
        for(int i=0; i<size; i++)
        {
            switch(Dealer.getInstance().getCardPack().getCards().get(i).getValue())
            {
                case 11:
                    System.out.print("King ");
                    break;
                case 12:
                    System.out.print("Queen ");
                    break;
                case 13:
                    System.out.print("Jack ");
                    break;
                case 14:
                    System.out.print("Ace ");
                    break;
                default:
                    System.out.print(Dealer.getInstance().getCardPack().getCards().get(i).getValue() + " ");
                    break;
            }
        }
        System.out.println("\n");
    }
    
    
    
    
    public void hit(GroupOfCards cards)
    {
        System.out.println();
        CardGenerator generator = new CardGenerator();
        cards.getCards().add(generator.cardGenerator());
       
        displayCards(cards);
        
        CalculateCardSum cardSum = new CalculateCardSum();
        cardSum.calculateCardSum(cards);
    }
    
    
    
    
   public void displayCards(GroupOfCards cardPack)
   {
       int size = cardPack.getCards().size();
       
       for(int i= 0; i<size; i++)
       {
           switch (cardPack.getCards().get(i).getValue()) 
           {
               case 11:
                   System.out.println("Card " + (i+1) + " is King.");
                   break;
               case 12:
                   System.out.println("Card " + (i+1) + " is Queen.");
                   break;
               case 13:
                   System.out.println("Card " + (i+1) + " is Jack.");
                   break;
               case 14:
                   System.out.println("Card " + (i+1) + " is Ace.");
                   break;
               default:
                   System.out.println("Card " + (i+1) + " is " + cardPack.getCards().get(i).getValue() + ".");
                   break;
           }
       }
   }
}
