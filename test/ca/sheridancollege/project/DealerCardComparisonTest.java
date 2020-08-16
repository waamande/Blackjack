package ca.sheridancollege.project;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Daljeet Singh
 */
public class DealerCardComparisonTest {
    
    public DealerCardComparisonTest() {
    }
    
    public void setUp() {
    }

    /**
     * Test of dealerCardComparison method, of class DealerCardComparison with good test.
     * Dealer wins the game.
     */
    @Test
    public void testDealerCardComparisonGood() {
        System.out.println("dealerCardComparisonGood");
        DealerCardComparison instance = new DealerCardComparison();
        GroupOfCards cards = new GroupOfCards();
        cards.setCardSum(21);
        Dealer.getInstance().setCardPack(cards);
        instance.dealerCardComparison();
    }
    
     /**
     * Test of dealerCardComparison method, of class DealerCardComparison with bad test.
     * Dealer loses the game.
     */
    @Test
    public void testDealerCardComparisonBad() {
        System.out.println("dealerCardComparisonBad");
        DealerCardComparison instance = new DealerCardComparison();
        GroupOfCards cards = new GroupOfCards();
        cards.setCardSum(10);
        Dealer.getInstance().setCardPack(cards);
        instance.dealerCardComparison();
    }
    
}
