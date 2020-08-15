
package ca.sheridancollege.project;

/**
 *
 * @author singh
 */
public class DealerController {
    private Dealer dealer;

    public DealerController()
    {
        dealer = Dealer.getInstance();
    }

    public void createDealer(String name)
    {
        dealer.setName(name);
    }
}
