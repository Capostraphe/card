import java.util.ArrayList;

public class Player { // basically the hand
    private ArrayList<Card> hand = new ArrayList<>();
    private String name;
    private int plyrCnt;
    public Deck firt = Main.makeDeck();
    public Player(String nam, int cnt) {
        name = nam;
        plyrCnt = cnt;
    }
    public void cardGetter() {
        // determine how many cards each player gets (depends on # of players, use loop to minus one from stan and add it to hand for each player.
            for (int a = 0; a < 52/plyrCnt; a++) {
                hand.add(firt.getDeck().get(0));
                firt.removeFirst();
            }
        }
    public void cardGetter2() {
        if (firt.cardLeft()>=1) {
            hand.add(firt.getDeck().get(0));
            firt.removeFirst();
        }
    }
    public String toString() {
        return name+": "+hand+" count: "+hand.size();
    }
}
