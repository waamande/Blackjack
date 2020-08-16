
package ca.sheridancollege.project;
import java.util.Scanner;

/**
 * This class acts as an interface and prompts user for value to create the dealer.
 * 
 * @version 1.0
 */
public class DealerView 
{
    private DealerController dealerController;

    
    public DealerView()
    {
        dealerController =  new DealerController();
    }

    
    public void run() 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Dealer's name: ");
        String name = input.nextLine();
        dealerController.createDealer(name);
    }

    public DealerController getDealerController() 
    {
        return dealerController;
    }
}
