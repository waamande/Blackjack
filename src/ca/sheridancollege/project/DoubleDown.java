package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 *
 * @author Amandeep Singh Walia
 */
public class DoubleDown 
{

    public int doubleDown(int num, Player player, GroupOfCards cards) 
    {

        Game game = new Game();

        player.setBetChips(player.getBetChips() * 2);

        System.out.println("Player " + player.getName() + " chips got doubled.");
        game.hit(cards);
        if (cards.getCardSum() > 21) 
        {
            game.declarePlayerLoser(num, cards);
            return 1;
        }

        return 0;
    }
}
