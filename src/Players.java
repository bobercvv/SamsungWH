import java.util.Locale;
import java.util.Scanner;

public class Players {
    protected String player1name = "1";
    protected String player2name = "2";

    public Players(String player1name, String player2name) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println("Select 1 player name: ");
        this.player1name = scan.nextLine();
        System.out.println("Select 2 player name: ");
        this.player2name = scan.nextLine();
    }

}
