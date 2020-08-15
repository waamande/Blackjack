package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * This class adds and controls the logic for proper functioning of players.
 * 
 * @author Daljeet singh
 * @version 1.0
 */
public class PlayerController {
    private ArrayList<Player> players;

    /**
     *  Default no-arg constructor of class which initializes the array list of 
     *  type class Player.
     */
    public PlayerController()
    {
        players = new ArrayList<Player>();
    }

    /**
     * Creates a player and adds it to array list.
     * 
     * @param name A string representing the name of player.
     * @param betChips An integer representing the chips bet by player.
     */
    public void createPlayer(String name, int betChips)
    {
        Player player = new Player();
        player.setName(name);
        player.setBetChips(betChips);

        players.add(player);
    }
    
}
