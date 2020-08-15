
package ca.sheridancollege.project;
import java.util.Scanner;

/**
 *
 * @author singh
 */
public class DealerView {
    private DealerController dealerController;

    public DealerView()
    {
        dealerController =  new DealerController();
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name");
        String name = input.nextLine();
        dealerController.createDealer(name);
    }

    //public void displayCards()
}
