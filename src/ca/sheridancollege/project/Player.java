package ca.sheridancollege.project;

/**
 *
 * @author Daljeet Singh
 */
public class Player {
    private String name;
    private int betChips;
    private GroupOfCards cardPack1;
    private GroupOfCards cardPack2;

    public Player()
    {
        cardPack1 = new GroupOfCards();
        cardPack2 = new GroupOfCards();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBetChips() {
        return betChips;
    }

    public void setBetChips(int betChips) {
        this.betChips = betChips;
    }
}
