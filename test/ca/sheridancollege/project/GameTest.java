package ca.sheridancollege.project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Daljeet Singh
 */
public class GameTest {
    
    public GameTest() {
    }
    
    public void setUp() {
    }

    /**
     * Manual test of hit method, of class Game.
     * The test will pass if a new card has been added to cardPack(cards) after hit has been called.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        GroupOfCards cards = new GroupOfCards();
        cards.getCards().add(new CardGenerator().cardGenerator());
        Game instance = new Game();
        instance.hit(cards);
        int expResult = 2;
        int result = cards.getCards().size();
        assertEquals(expResult,result);
    }

}
