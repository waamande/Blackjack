
package ca.sheridancollege.project;
import java.util.Scanner;

/**
 * This class acts as an interface and prompts user for value to create the dealer.
 * 
 * @version 1.0
 */
public class DealerView {
    private DealerController dealerController;

    /**
     * Default no-arg constructor which initializes the instance of class DealerController.
     */
    public DealerView()
    {
        dealerController =  new DealerController();
    }

    /**
     * Prompts the user for name and creates a dealer.
     */
    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name");
        String name = input.nextLine();
        dealerController.createDealer(name);
    }

    //public void displayCards()
}
