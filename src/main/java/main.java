public class main {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal veggieMeal = mealBuilder.prepareVeggieBurgerFanta();
        System.out.println("Zestaw Vege");
        veggieMeal.showItems();
        System.out.println("Calkowity koszt: " + veggieMeal.getCost());

        Meal chickenMeal = mealBuilder.prepareChickenBurgerCoke();
        System.out.println("\n\nZestaw kurczak");
        chickenMeal.showItems();
        System.out.println("Calkowity koszt: " + chickenMeal.getCost());
    }
}
