/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amandeep Singh Walia
 */
public class PlayerDealerCardComparisonTest {
    
    public PlayerDealerCardComparisonTest() {
    }
    
    @Before
    public void setUp() {
    }

    
    
    /**
     * Test of PlayerDealerCardComparison method, of class PlayerDealerCardComparison.
     * Testing a method for player win and dealer lose condition
     */
    @Test
    public void testPlayerDealerCardComparisonWin() {
        System.out.println("PlayerDealerCardComparisonPlayerWinDealerLose");
        Player player = new Player();
        player.getCardPack1().setCardSum(20);
        Dealer.getInstance().getCardPack().setCardSum(18);
        boolean expResult = true;
        boolean result = player.getCardPack1().getCardSum() > Dealer.getInstance().getCardPack().getCardSum();
        assertEquals(expResult, result);
       }
    
    
    /**
     * Test of PlayerDealerCardComparison method, of class PlayerDealerCardComparison.
     * Testing a method for player win and dealer lose condition
     */
    @Test
    public void testPlayerDealerCardComparisonLoose() {
        System.out.println("PlayerDealerCardComparisonPlayerLoseDealerWin");
        Player player = new Player();
        player.getCardPack1().setCardSum(18);
        Dealer.getInstance().getCardPack().setCardSum(20);
        boolean expResult = true;
        boolean result = player.getCardPack1().getCardSum() < Dealer.getInstance().getCardPack().getCardSum();
        assertEquals(expResult, result);
       }
}
