public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 20;
    }

    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public String ingredients() {
        return "Kurczak, ser, pomidor, ogorek";
    }
}
