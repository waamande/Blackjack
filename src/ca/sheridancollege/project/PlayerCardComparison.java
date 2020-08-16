package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 *
 * @author Amandeep Singh Walia
 */
public class PlayerCardComparison 
{

    public int playerCardComparison(int num) 
    {
        int cardSum = BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCardSum();
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        if (cardSum == 21) 
        {
            game.declarePlayerWinner(num, 1, BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1());
            BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().remove(num);
            return 1;

        } 
        else if (BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCards().get(0).getValue() == BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCards().get(1).getValue()) 
        {
            System.out.print("Do you want to split(yes or no): ");
            String split = scanner.next();

            if (split.equalsIgnoreCase("yes")) 
            {
                BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).setSplit(true);
                if (BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCards().get(0).getValue() == 14) 
                {
                    BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().setCardSum(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCardSum() - BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCards().get(0).getBlackjackCardValue());
                    BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().setCountForSum(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCountForSum() - 1);
                    BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCards().remove(1);
                    game.hit(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1());

                    BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack2().getCards().add(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCards().get(0));
                    game.hit(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack2());
                } 
                else 
                {
                    int count = 0;
                    BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().setCardSum(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCardSum() - BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCards().get(0).getBlackjackCardValue());
                    BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().setCountForSum(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCountForSum() - 1);
                    BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCards().remove(1);
                    System.out.println("For first card pack:");
                    game.hit(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1());

                    BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack2().getCards().add(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCards().get(0));
                    System.out.println("For Second card pack: ");
                    game.hit(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack2());
                    
                    int z = 0;
                    if((BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCardSum() == 9) || (BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCardSum() == 10) || (BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCardSum() == 11))
                    {
                        System.out.print("Do you want to Double down(yes or no): ");
                        String doubleDown = scanner.next();
                        if(doubleDown.equalsIgnoreCase("yes"));
                        {
                            DoubleDown dDown = new DoubleDown();
                            int r = dDown.doubleDown(num, BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num), BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1());
                            z=1;
                            if(r==1)
                            {
                                BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCards().clear();
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
                            game.hit(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1());
                            if (BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCardSum() <= 21) 
                            {
                                System.out.print("Do you want to hit for first pack(yes or no): ");
                                hit = scanner.next();
                            } 
                            else
                            {
                                hit = "no";
                                game.declarePlayerLoser(num, BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1());
                                BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCards().clear();
                                count++;
                            }
                        }
                    }
                    
                    z=0;
                    if((BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack2().getCardSum() == 9) || (BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack2().getCardSum() == 10) || (BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack2().getCardSum() == 11))
                    {
                        System.out.print("Do you want to Double down(yes or no): ");
                        String doubleDown = scanner.next();
                        if(doubleDown.equalsIgnoreCase("yes"));
                        {
                            DoubleDown dDown = new DoubleDown();
                            int r = dDown.doubleDown(num, BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num), BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack2());
                            z=1;
                            if(r == 1)
                            {
                                BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack2().getCards().clear();
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
                            game.hit(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack2());
                            if (BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack2().getCardSum() <= 21) 
                            {
                                System.out.print("Do you want to hit for second pack(yes or no): ");
                                hit = scanner.next();
                            }
                            else
                            {
                                hit = "no";
                                game.declarePlayerLoser(num, BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack2());
                                BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack2().getCards().clear();
                                count++;
                            }
                        }
                    }

                    if (count == 2)
                    {
                        BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().remove(num);
                        return 1;
                    }
                }
            }
        }
        else if((BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCardSum() == 9) || (BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCardSum() == 10) || (BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCardSum() == 11))
        {
            System.out.print("Do you want to Double down(yes or no): ");
            String doubleDown = scanner.next();
            if(doubleDown.equalsIgnoreCase("yes"));
            {
                DoubleDown dDown = new DoubleDown();
                int r = dDown.doubleDown(num, BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num), BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1());
                if(r==1)
                {
                    BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().remove(num);
                    return 1;
                }
            }
        }
        else
        {
            System.out.print("Do you want to hit(yes or no): ");
            String hit = scanner.next();
            while (hit.equalsIgnoreCase("yes")) 
            {
                game.hit(BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1());
                if (BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1().getCardSum() <= 21) 
                {
                    System.out.print("Do you want to hit(yes or no): ");
                    hit = scanner.next();
                } else
                {
                    hit = "no";
                    game.declarePlayerLoser(num, BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().get(num).getCardPack1());
                    BlackJack.getInstance().getPlayerView().getPlayerController().getPlayers().remove(num);
                    return 1;
                }
            }
        }
        return 0;
    }
}
