public class Wizard extends Unit {
    protected int mana = 100;

    public Wizard(String name) {
        super(name);
        super.power = 25;
        super.defence = 80;
    }

    // Переопределяем метод атаки для мага
    @Override
    public void attack(Unit unit) {
        mana -= 10;
        if (mana != 0) {

            super.attack(unit);
        }
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", health=" + health +
                ", defence=" + defence +
                '}';
    }
}
