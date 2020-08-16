
package ca.sheridancollege.project;
import java.util.Scanner;

/**
 * This class acts as interface and interacts with user.
 * 
 * @author Daljeet Singh
 * @version 1.0
 */
public class PlayerView 
{
    private PlayerController playerController;

    
    public PlayerView() 
    {
        playerController = new PlayerController();
    }

  
    public void run(int playerNumber) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Player " + playerNumber + " name: ");
        String name = input.nextLine();
        System.out.print("Please enter number of chips you want to bet: ");
        int betChips = input.nextInt();
        playerController.createPlayer(name, betChips);
    }

    public PlayerController getPlayerController() 
    {
        return playerController;
    }
    
   
   public int getAceValue(int cardNumber)
   {
       Scanner scanner = new Scanner(System.in);
       int x=0;
       int value=0;
       while(x==0)
       {
           System.out.print("Enter value for Card " +cardNumber + " Ace(1 or 11): ");
           value = scanner.nextInt();
           if(value==1 || value==11)
           {
               x=1;
           }
       }
       return value;
   }
}

  


