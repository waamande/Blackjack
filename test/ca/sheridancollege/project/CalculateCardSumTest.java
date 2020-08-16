
package ca.sheridancollege.project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
/**
 *
 * @author Daljeet Singh
 */
public class CalculateCardSumTest {
    
    public CalculateCardSumTest() {
    }
    public void setUp() {
    }
    
    
    /**
     * Manual Test of calculateCardSum method, of class CalculateCardSum.
     * The method tests if the calculation of sum of cards is accurate or not.
     */
    @Test
    public void testCalculateCardSum() {
        System.out.println("calculateCardSum");
        GroupOfCards cardPack = new GroupOfCards();
        Card card1 = new Card();
        card1.setValue(10);
        Card card2 = new Card();
        card2.setValue(10);
        cardPack.getCards().add(card1);
        cardPack.getCards().add(card2);
        int expResult = 20;
        CalculateCardSum instance = new CalculateCardSum();
        instance.calculateCardSum(cardPack);
        int result = cardPack.getCardSum();
        assertEquals(expResult,result);
    }
}
    
    
  