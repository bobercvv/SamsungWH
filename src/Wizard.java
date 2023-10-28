public class Wizard extends Unit {
    protected int mana = 100;

    public Wizard(String name) {
        super(name);
    }

    // Переопределяем метод атаки для мага
    @Override
    public void attack(Unit unit) {
        mana -= 10;
        if (mana != 0) {
            power = 25;
            defence = 80;
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
