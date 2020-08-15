
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class PlayerController {
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

        players.add(player);
    }
    
}
