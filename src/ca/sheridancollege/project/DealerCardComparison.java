package ca.sheridancollege.project;

/**
 * This class +++Insert Description Here+++
 * 
 * @author Amandeep Singh Walia
 */
public class DealerCardComparison 
{
    public void dealerCardComparison()
    {
        Game game = new Game();
        if(Dealer.getInstance().getCardPack().getCardSum() == 21)
        {
            game.declareDealerWinner(1);
            int size = BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().size();
            for(int i=0; i<size; i++)
            {
                if(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(i).isSplit())
                {
                    game.declarePlayerLoser(i, BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(i).getCardPack1());
                    game.declarePlayerLoser(i, BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(i).getCardPack2());
                    BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().remove(i);
                }
                else
                {
                    game.declarePlayerLoser(i, BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(i).getCardPack1());
                }
            }
            System.exit(0);
        }
        else if(Dealer.getInstance().getCardPack().getCardSum() <= 16)
        {
            game.hit(Dealer.getInstance().getCardPack());
            if( Dealer.getInstance().getCardPack().getCardSum() > 21)
            {
                game.declareDealerLoser();
                int size = BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().size();
                for(int i=0; i<size; i++)
                {
                     if(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(i).isSplit())
                     {
                         game.declarePlayerWinner(i, 2, BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(i).getCardPack1());
                         game.declarePlayerWinner(i, 2, BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(i).getCardPack2());
                     }
                     else
                     {
                         game.declarePlayerWinner(i, 2, BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(i).getCardPack1());
                     }
                }
                System.exit(0);
            }
        }          
    }
}
