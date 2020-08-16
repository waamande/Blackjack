package ca.sheridancollege.project;

import java.util.Random;

/**
 * This class +++Insert Description Here+++
 * 
 * @author Amandeep Singh Walia
 */
public class CardGenerator 
{
    public Card cardGenerator()
    {
        Card card = new Card();
        Random random = new Random();
        int value = random.nextInt(14) + 1;
        card.setValue(value);      
        return card;
    }
}
