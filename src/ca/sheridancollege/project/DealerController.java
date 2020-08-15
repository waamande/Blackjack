
package ca.sheridancollege.project;

/**
 * This class adds and controls the logic for proper functioning of Dealer.
 * 
 * @version 1.0
 */
public class DealerController {
    private Dealer dealer;

    /**
     * Default no-arg constructor which initializes the instance of class Dealer. 
     */
    public DealerController()
    {
        dealer = Dealer.getInstance();
    }
    
    /**
     * Creates the dealer.
     * 
     * @param name A string representing the name of dealer.
     */
    public void createDealer(String name)
    {
        dealer.setName(name);
    }
}
