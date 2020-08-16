
package ca.sheridancollege.project;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Daljeet Singh
 */
public class CardGeneratorTest {
    
    public CardGeneratorTest() {
    }
    
    public void setUp() {
    }

    /**
     * Test of cardGenerator method, of class CardGenerator with good test.
     * Card generator generates a card.
     */
    @Test
    public void testCardGeneratorGood() {
        System.out.println("cardGeneratorGood");
        CardGenerator instance = new CardGenerator();
        Card test = instance.cardGenerator();
        boolean expResult = true;
        boolean result = test instanceof Card; 
        assertEquals(expResult, result);
    }   
    
     /**
     * Test of cardGenerator method, of class CardGenerator with bad test.
     * Card generator can't generate a card.
     */
    @Test
    public void testCardGeneratorBad() {
        System.out.println("cardGeneratorBad");
        CardGenerator instance = new CardGenerator();
        Card test = instance.cardGenerator();
        boolean expResult = false;
        boolean result = !(test instanceof Card); 
        assertEquals(expResult, result);
    }   
    
      /**
     * Test of cardGenerator method, of class CardGenerator with boundary test.
     * Card generator generates a card.
     */
    @Test
    public void testCardGeneratorBoundary() {
        System.out.println("cardGeneratorBoundary");
        CardGenerator instance = new CardGenerator();
        Card test = instance.cardGenerator();
        boolean expResult = true;
        boolean result = test instanceof Card; 
        assertEquals(expResult, result);
    }  
}
