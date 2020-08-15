
package ca.sheridancollege.project;
import java.util.Scanner;

/**
 * This class acts as interface and interacts with user.
 * 
 * @author Daljeet Singh
 * @version 1.0
 */
public class PlayerView {
    private PlayerController playerController;

    /**
     *  Default no-arg constructor of the class which initializes the instance
     *  of class PlayerController.
     */
    public PlayerView() {
        playerController = new PlayerController();
    }

    /**
     * Prompts the user for name and betChips and then use them to create a player.
     */
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


