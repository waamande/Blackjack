package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 *
 * @author Amandeep Singh Walia
 */
public class BlackJack 
{

    private PlayerView playerView = null;
    private DealerView dealerView = null;
    private static BlackJack blackJack = null;

    private BlackJack() 
    {
        playerView = new PlayerView();
        dealerView = new DealerView();
    }

    public static BlackJack getInstance() 
    {
        if (blackJack == null) {
            blackJack = new BlackJack();
        }
        return blackJack;
    }

    public PlayerView getPlayerView() 
    {
        return playerView;
    }

    public DealerView getDealerView() 
    {
        return dealerView;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Players (maximum players is 6): ");
        int numberOfPlayers = scanner.nextInt();
        int x = 0;
        do {
            switch (numberOfPlayers) 
            {
                case 1:
                    getInstance().playerView.run(1);
                    System.out.println();
                    break;
                case 2:
                    getInstance().playerView.run(1);
                    System.out.println();
                    getInstance().playerView.run(2);
                    System.out.println();
                    break;
                case 3:
                    getInstance().playerView.run(1);
                    System.out.println();
                    getInstance().playerView.run(2);
                    System.out.println();
                    getInstance().playerView.run(3);
                    System.out.println();
                    break;
                case 4:
                    getInstance().playerView.run(1);
                    System.out.println();
                    getInstance().playerView.run(2);
                    System.out.println();
                    getInstance().playerView.run(3);
                    System.out.println();
                    getInstance().playerView.run(4);
                    System.out.println();
                    break;
                case 5:
                    getInstance().playerView.run(1);
                    System.out.println();
                    getInstance().playerView.run(2);
                    System.out.println();
                    getInstance().playerView.run(3);
                    System.out.println();
                    getInstance().playerView.run(4);
                    System.out.println();
                    getInstance().playerView.run(5);
                    System.out.println();
                    break;
                case 6:
                    getInstance().playerView.run(1);
                    System.out.println();
                    getInstance().playerView.run(2);
                    System.out.println();
                    getInstance().playerView.run(3);
                    System.out.println();
                    getInstance().playerView.run(4);
                    System.out.println();
                    getInstance().playerView.run(5);
                    System.out.println();
                    getInstance().playerView.run(6);
                    System.out.println();
                    break;
                default:
                    x = 1;
                    System.out.println("You enterd the wrong value!!!");
                    System.out.print("Please enter number of players again (maximum players is 6): ");
                    numberOfPlayers = scanner.nextInt();
            }
        } while (x == 1);
        
        System.out.println();
        getInstance().getDealerView().run();
        
        int size = getInstance().getPlayerView().getPlayerController().getPlayers().size();
        CalculateCardSum cardSum = new CalculateCardSum();
        PlayerCardComparison playerComparison = new PlayerCardComparison();
        Game game = new Game();
        
        for(int i=0; i<size; i++)
        {
            System.out.println();
            System.out.println("Player " + getInstance().getPlayerView().getPlayerController().getPlayers().get(i).getName() + " cards are as follows:");
            game.displayCards(getInstance().getPlayerView().getPlayerController().getPlayers().get(i).getCardPack1()); 
            cardSum.calculateCardSum(getInstance().getPlayerView().getPlayerController().getPlayers().get(i).getCardPack1());
            int y = playerComparison.playerCardComparison(i);
            if(y == 1)
            {
                i--;
            }
        }
        
        System.out.println();
        System.out.println("Dealer " + Dealer.getInstance().getName() + " cards are as follows: ");
        game.displayCards(Dealer.getInstance().getCardPack());
        cardSum.calculateCardSum(Dealer.getInstance().getCardPack());
        DealerCardComparison dealerComparison = new DealerCardComparison();
        dealerComparison.dealerCardComparison();
        
        System.out.println();
        PlayerDealerCardComparison comparison = new PlayerDealerCardComparison();
        comparison.PlayerDealerCardComparison(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers());
    }
}
