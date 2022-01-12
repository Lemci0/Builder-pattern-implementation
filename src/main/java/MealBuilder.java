public class MealBuilder {

    public Meal prepareChickenBurgerCoke() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareVeggieBurgerFanta() {
        Meal meal = new Meal();
        meal.addItem(new VeggieBurger());
        meal.addItem(new Fanta());
        return meal;
    }
}
