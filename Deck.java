import java.util.ArrayList;
import java.util.Collections;
public class Deck {
    ArrayList<Card> stan = new ArrayList<>();
    public Deck() {
    initi();
    }
    private void initi() {
        for (int a = 3; a <= 15; a++) {
            stan.add(new Card(a, "C"));
            stan.add(new Card(a, "S"));
            stan.add(new Card(a, "H"));
            stan.add(new Card(a, "D"));
        }
        Collections.shuffle(stan);
    }
    public ArrayList<Card> getDeck() {
        return stan;
    }
    public void removeFirst () {
        stan.remove(0);
    }
    public int cardLeft() {
        return stan.size();
    }
    public String toString() {
        String toRet = "";
        for (int b = 0; b < stan.size(); b++) {
            toRet += stan.get(b)+", ";
        }
        return toRet;
    }
}
