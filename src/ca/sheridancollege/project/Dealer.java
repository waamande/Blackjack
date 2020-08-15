package ca.sheridancollege.project;

/**
 *
 * @author singh
 */
public class Dealer {
    private String name;
    private GroupOfCards cardPack;
    private static Dealer dealer;

    private Dealer()
    {
        cardPack = new GroupOfCards();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Dealer getInstance() {
        if (dealer == null) {
            dealer = new Dealer();
        }
        return dealer;
    }
}
