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
        Game game = new Game();
        
        for(int i=0; i<size; i++)
        {
            if(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(i).isSplit())
            {
                int count2 = 0;
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
            
            if(count1 == size)
            {
                game.declareDealerLoser();
            }
            else
            {
                game.declareDealerWinner(2);
            }   
        }
    }
}
