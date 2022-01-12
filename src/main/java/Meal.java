import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Produkt: " + item.name());
            System.out.println("Skladniki: " + item.ingredients());
            System.out.println("Cena: " + item.price());
        }
    }
}
