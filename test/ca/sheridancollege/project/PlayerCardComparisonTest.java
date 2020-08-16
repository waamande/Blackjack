/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amandeep Singh Walia
 */
public class PlayerCardComparisonTest {
    
    public PlayerCardComparisonTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of playerCardComparison method, of class PlayerCardComparison.
     * Testing a method for blackjack condition.
     */
    @Test
    public void testPlayerCardComparisonBlackJack() {
        System.out.println("playerCardComparisonBlackJack");
        Player player = new Player();
        int expResult = 21;
        player.getCardPack1().setCardSum(21);
        assertEquals(expResult, player.getCardPack1().getCardSum());
    }
    
    /**
     * Test of playerCardComparison method, of class PlayerCardComparison.
     * Testing a method for double down condition.
     */
    @Test
    public void testPlayerCardComparisonDoubleDown() {
        System.out.println("playerCardComparisonBlackJack");
        Player player = new Player();
        int expResult = 1;
        player.getCardPack1().setCardSum(10);
        int result = 0;
        if(player.getCardPack1().getCardSum() == 9 || player.getCardPack1().getCardSum() == 10 || player.getCardPack1().getCardSum()==11)
        {
            result = 1;
        }
        assertEquals(expResult, result);
    }
    
    
    
    /**
     * Test of playerCardComparison method, of class PlayerCardComparison.
     * Testing a method for two same cards condition.
     */
    @Test
    public void testPlayerCardComparisonSameCards() {
        System.out.println("playerCardComparisonSameCards");
        Player player = new Player();
        Card card1 = new Card();
        card1.setValue(5);
        Card card2 = new Card();
        card2.setValue(5);
        player.getCardPack1().getCards().add(card1);
        player.getCardPack1().getCards().add(card2);
        boolean expResult = true;
        boolean result = (player.getCardPack1().getCards().get(0).getValue() == player.getCardPack1().getCards().get(1).getValue());
        assertEquals(expResult, result);
    }
    
    
    
    /**
     * Test of playerCardComparison method, of class PlayerCardComparison.
     * Testing a method for two aces condition.
     */
    @Test
    public void testPlayerCardComparisonTwoAces() {
        System.out.println("playerCardComparisonTwoAces");
        Player player = new Player();
        Card card1 = new Card();
        card1.setValue(14);
        Card card2 = new Card();
        card2.setValue(14);
        player.getCardPack1().getCards().add(card1);
        player.getCardPack1().getCards().add(card2);
        int expResult = 1;
        int result = 0;
        if( player.getCardPack1().getCards().get(0).getValue() == 14 && player.getCardPack1().getCards().get(1).getValue() == 14)
        {
            result = 1;
        }
        assertEquals(expResult, result);
    }
    
    
     /**
     * Test of playerCardComparison method, of class PlayerCardComparison.
     * Testing a method for two same cards other than aces condition.
     */
    @Test
    public void testPlayerCardComparisonTwoSameCardsOtherThanAces() {
        System.out.println("playerCardComparisonTwoSameCardsOtherThanAces");
        Player player = new Player();
        Card card1 = new Card();
        card1.setValue(12);
        Card card2 = new Card();
        card2.setValue(12);
        player.getCardPack1().getCards().add(card1);
        player.getCardPack1().getCards().add(card2);
        int expResult = 1;
        int result = 0;
        if( player.getCardPack1().getCards().get(0).getValue() != 14 && player.getCardPack1().getCards().get(1).getValue() != 14 && player.getCardPack1().getCards().get(0).getValue() == player.getCardPack1().getCards().get(1).getValue())
        {
            result = 1;
        }
        assertEquals(expResult, result);
    }
    
    
    
    
    /**
     * Test of playerCardComparison method, of class PlayerCardComparison.
     * Testing a method for two different cards condition.
     */
     @Test
     public void testPlayerCardComparisonDifferentCards() {
        System.out.println("playerCardComparisonDifferentCards");
        Player player = new Player();
        Card card1 = new Card();
        card1.setValue(5);
        Card card2 = new Card();
        card2.setValue(6);
        player.getCardPack1().getCards().add(card1);
        player.getCardPack1().getCards().add(card2);
        boolean expResult = false;
        boolean result = (player.getCardPack1().getCards().get(0).getValue() == player.getCardPack1().getCards().get(1).getValue());
        assertEquals(expResult, result);
    }
     
     
}
