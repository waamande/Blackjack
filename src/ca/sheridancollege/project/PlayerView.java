
package ca.sheridancollege.project;
import java.util.Scanner;

/**
 *
 * @author singh
 */
public class PlayerView {
    private PlayerController playerController;

    public PlayerView() {
        playerController = new PlayerController();
    }

    public void run() {
            Scanner input = new Scanner(System.in);
            boolean exitFlag = false;
            do {
                System.out.println("Please enter the name");
                String name = input.nextLine();
                System.out.println("Please enter number of chips you want to bet");
                int betChips = input.nextInt();
                playerController.createPlayer(name, betChips);
                System.out.println("Do you want to continue ?Y/N");
                String temp = input.nextLine();
                if (temp.compareToIgnoreCase("N") == 0) {
                    exitFlag = true;
                }
            } while (exitFlag != true);
        }
    }

    //public void displayCards();


