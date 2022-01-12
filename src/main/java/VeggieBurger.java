public class VeggieBurger extends Burger {

    @Override
    public float price() {
        return 18;
    }

    @Override
    public String name() {
        return "VeggieBurger";
    }

    @Override
    public String ingredients() {
        return "Ser, salata, pomidor, ogorek";
    }
}
