import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* Card card1 = new Card();
        card1.setSuite(Suits.DIAMONDS);
        card1.setRank(Ranks.QUEEN);

        Card card2 = new Card();
        card2.setSuite(Suits.SPADES);
        card2.setRank(Ranks.JACK);

        Card card3 = new Card();
        card3.setSuite(Suits.CLUBS);
        card3.setRank(Ranks.KING);

        card1.getDescription();
        card2.getDescription();
        card3.getDescription();
        */

        System.out.println("Enter suite(0 for CLUBS, 1 FOR DIAMONDS, 2 for HEARTS, 3 for SPADES): ");
        int temp1 = sc.nextInt();
        System.out.println("Enter rank(0 for ACE, 1 for KING, 2 FOR QUEEN, 3 FOR JACK): ");
        int temp2 = sc.nextInt();

        Card card4 = new Card(Suits.values()[temp1], Ranks.values()[temp2]);

        card4.getDescription();
    }
}
