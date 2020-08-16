package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * This class adds and controls the logic for proper functioning of players.
 * 
 * @author Daljeet singh
 * @version 1.0
 */
public class PlayerController 
{
    private ArrayList<Player> players;

    public PlayerController()
    {
        players = new ArrayList<Player>();
    }

    public void createPlayer(String name, int betChips)
    {
        Player player = new Player();
        player.setName(name);
        player.setBetChips(betChips);
        
        CardGenerator generator = new CardGenerator();
        GroupOfCards cards = new GroupOfCards();
        
        cards.getCards().add(generator.cardGenerator());
        cards.getCards().add(generator.cardGenerator());
        
        player.setCardPack1(cards);
        players.add(player);
    }

    public ArrayList<Player> getPlayers() 
    {
        return players;
    }
    
    
    
}
