import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static Deck fir = new Deck();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("# of players?");
        int playerCount = sc.nextInt();
        ArrayList<Player> players = new ArrayList<>();
        for (int a = 1; a < playerCount+1; a++) {
            System.out.println(a+"'s name?: ");
            String plrName = sc.next();
            players.add(new Player(plrName,playerCount));
            players.get(a-1).cardGetter();
        }
        for (int b = 0; b < playerCount; b++) {
            players.get(b).cardGetter2();
            System.out.println(players.get(b));
        }
    }
    public static Deck makeDeck() {
        return fir;
    }
    }
