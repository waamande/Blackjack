package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 *
 * @author Amandeep Singh Walia
 */
public class PlayerCardComparison 
{

    public int playerCardComparison(int playerNum, Player player) 
    {
        int cardSum = player.getCardPack1().getCardSum();
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        if (cardSum == 21) 
        {
            game.declarePlayerWinner(playerNum, 1,player.getCardPack1());
            BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().remove(playerNum);
            return 1;

        } 
        else if (player.getCardPack1().getCards().get(0).getValue() == player.getCardPack1().getCards().get(1).getValue()) 
        {
            System.out.print("Do you want to split(yes or no): ");
            String split = scanner.next();

            if (split.equalsIgnoreCase("yes")) 
            {
                player.setSplit(true);
                if (player.getCardPack1().getCards().get(0).getValue() == 14) 
                {
                    player.getCardPack1().setCardSum(player.getCardPack1().getCardSum() - player.getCardPack1().getCards().get(0).getBlackjackCardValue());
                    player.getCardPack1().setCountForSum(player.getCardPack1().getCountForSum() - 1);
                    player.getCardPack1().getCards().remove(1);
                    game.hit(player.getCardPack1());

                    player.getCardPack2().getCards().add(player.getCardPack1().getCards().get(0));
                    game.hit(player.getCardPack2());
                } 
                else 
                {
                    int count = 0;
                    player.getCardPack1().setCardSum(player.getCardPack1().getCardSum() - player.getCardPack1().getCards().get(0).getBlackjackCardValue());
                    player.getCardPack1().setCountForSum(player.getCardPack1().getCountForSum() - 1);
                    player.getCardPack1().getCards().remove(1);
                    System.out.println("For first card pack:");
                    game.hit(player.getCardPack1());

                    player.getCardPack2().getCards().add(player.getCardPack1().getCards().get(0));
                    System.out.println("For Second card pack: ");
                    game.hit(player.getCardPack2());
                    
                    int z = 0;
                    if((player.getCardPack1().getCardSum() == 9) || (player.getCardPack1().getCardSum() == 10) || (player.getCardPack1().getCardSum() == 11))
                    {
                        System.out.print("Do you want to Double down(yes or no): ");
                        String doubleDown = scanner.next();
                        if(doubleDown.equalsIgnoreCase("yes"));
                        {
                            DoubleDown dDown = new DoubleDown();
                            int r = dDown.doubleDown(playerNum, player, player.getCardPack1());
                            z=1;
                            if(r==1)
                            {
                                player.getCardPack1().getCards().clear();
                                count++;
                            }
                        }
                    }
                    
                    if(z==0)
                    {
                        System.out.print("Do you want to hit for first pack(yes or no): ");
                        String hit = scanner.next();
                        while (hit.equalsIgnoreCase("yes")) 
                        {
                            System.out.println("For first card pack:");
                            game.hit(player.getCardPack1());
                            if (player.getCardPack1().getCardSum() <= 21) 
                            {
                                System.out.print("Do you want to hit for first pack(yes or no): ");
                                hit = scanner.next();
                            } 
                            else
                            {
                                hit = "no";
                                game.declarePlayerLoser(playerNum, player.getCardPack1());
                                player.getCardPack1().getCards().clear();
                                count++;
                            }
                        }
                    }
                    
                    z=0;
                    if((player.getCardPack2().getCardSum() == 9) || (player.getCardPack2().getCardSum() == 10) || (player.getCardPack2().getCardSum() == 11))
                    {
                        System.out.print("Do you want to Double down(yes or no): ");
                        String doubleDown = scanner.next();
                        if(doubleDown.equalsIgnoreCase("yes"));
                        {
                            DoubleDown dDown = new DoubleDown();
                            int r = dDown.doubleDown(playerNum, player, player.getCardPack2());
                            z=1;
                            if(r == 1)
                            {
                                player.getCardPack2().getCards().clear();
                                count++;
                            }
                        }
                    }
                    
                    if(z==0)
                    {
                        System.out.print("Do you want to hit for second pack(yes or no): ");
                        String hit = scanner.next();
                        while (hit.equalsIgnoreCase("yes")) 
                        {
                            System.out.println("For Second card pack: ");
                            game.hit(player.getCardPack2());
                            if (player.getCardPack2().getCardSum() <= 21) 
                            {
                                System.out.print("Do you want to hit for second pack(yes or no): ");
                                hit = scanner.next();
                            }
                            else
                            {
                                hit = "no";
                                game.declarePlayerLoser(playerNum, player.getCardPack2());
                                player.getCardPack2().getCards().clear();
                                count++;
                            }
                        }
                    }

                    if (count == 2)
                    {
                        BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().remove(playerNum);
                        return 1;
                    }
                }
            }
        }
        else
        {
            int z=0;
            if((player.getCardPack1().getCardSum() == 9) || (player.getCardPack1().getCardSum() == 10) || (player.getCardPack1().getCardSum() == 11))
            {
                System.out.print("Do you want to Double down(yes or no): ");
                String doubleDown = scanner.next();
                if(doubleDown.equalsIgnoreCase("yes"));
                {
                    z=1;
                    DoubleDown dDown = new DoubleDown();
                    int r = dDown.doubleDown(playerNum, player, player.getCardPack1());
                    if(r==1)
                    {
                        BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().remove(playerNum);
                        return 1;
                    }
                }
            }
            
            if(z==0)
            {
                System.out.print("Do you want to hit(yes or no): ");
                String hit = scanner.next();
                while (hit.equalsIgnoreCase("yes")) 
                {
                    game.hit(player.getCardPack1());
                    if (player.getCardPack1().getCardSum() <= 21) 
                    {
                        System.out.print("Do you want to hit(yes or no): ");
                        hit = scanner.next();
                    } 
                    else
                    {
                        hit = "no";
                        game.declarePlayerLoser(playerNum, player.getCardPack1());
                        BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().remove(playerNum);
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
