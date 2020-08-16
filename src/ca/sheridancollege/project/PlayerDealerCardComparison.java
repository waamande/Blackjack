package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * This class +++Insert Description Here+++
 * 
 * @author Amandeep Singh Walia
 */
public class PlayerDealerCardComparison 
{
    public void PlayerDealerCardComparison(ArrayList<Player> players)
    {
        int size = players.size();
        int count1 = 0;
        int count2;
        Game game = new Game();
        
        for(int i=0; i<size; i++)
        {
            if(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(i).isSplit())
            {
                count2 = 0;
                if(!players.get(i).getCardPack1().getCards().isEmpty())
                { 
                    if(players.get(i).getCardPack1().getCardSum() > Dealer.getInstance().getCardPack().getCardSum())
                    {
                        game.declarePlayerWinner(i, 2, players.get(i).getCardPack1());
                    }
                    else if(players.get(i).getCardPack1().getCardSum() < Dealer.getInstance().getCardPack().getCardSum())
                    {
                        game.declarePlayerLoser(i, players.get(i).getCardPack1());
                        count2++;
                    }
                    else
                    {
                        System.out.println("This is a push between player " + players.get(i).getName() + " and Dealer " + Dealer.getInstance().getName());
                    }
                }
                else
                {
                    count2++;
                }
                
               if(!players.get(i).getCardPack2().getCards().isEmpty())
                { 
                    if(players.get(i).getCardPack2().getCardSum() > Dealer.getInstance().getCardPack().getCardSum())
                    {
                        game.declarePlayerWinner(i, 2, players.get(i).getCardPack2());
                    }
                    else if(players.get(i).getCardPack2().getCardSum() < Dealer.getInstance().getCardPack().getCardSum())
                    {
                        game.declarePlayerLoser(i, players.get(i).getCardPack2());
                        count2++;
                    }
                    else
                    {
                        System.out.println("This is a push between player " + players.get(i).getName() + " and Dealer " + Dealer.getInstance().getName());
                    }
                }
               else
               {
                   count2++;
               }
                
                if(count2 == 2)
                {
                    count1++;
                }
            }
            else
            {
                if(players.get(i).getCardPack1().getCardSum() > Dealer.getInstance().getCardPack().getCardSum())
                {
                    game.declarePlayerWinner(i, 2, players.get(i).getCardPack1());
                }
                else if(players.get(i).getCardPack1().getCardSum() < Dealer.getInstance().getCardPack().getCardSum())
                {
                    game.declarePlayerLoser(i, players.get(i).getCardPack1());
                    count1++;
                }
                else
                {
                    System.out.println("This is a push between player " + players.get(i).getName() + " and Dealer " + Dealer.getInstance().getName());
                }
            }
        }
        if(count1 == size)
        {
            game.declareDealerWinner(2);
        }
        else
        {
            game.declareDealerLoser();
        }   
    }
}
