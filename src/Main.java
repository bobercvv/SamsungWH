public class Main {
    public static void main(String[] args) {
        Game game1 = new Game();
        Unit unit1 = new Unit("Jake");
        Game game2 = new Game();
        Wizard wz1 = new Wizard("W1");
        Wizard wz2 = new Wizard("W2");
        System.out.println(wz1);
        wz2.attack(wz1);
        System.out.println(wz1);
        System.out.println(Game.CountOfPlayers);


    }
}
