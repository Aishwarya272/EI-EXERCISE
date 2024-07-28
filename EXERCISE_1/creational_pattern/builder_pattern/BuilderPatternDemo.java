public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Create a simple burger with bun and patty
        Burger basicBurger = new Burger.BurgerBuilder("Sesame", "Beef").build();
        System.out.println(basicBurger);

        // Create a customized burger with all ingredients
        Burger customBurger = new Burger.BurgerBuilder("Brioche", "Chicken")
                .cheese("Cheddar")
                .sauce("Mayo")
                .tomato(true)
                .pickles(true)
                .onions(true)
                .build();
        System.out.println(customBurger);

        // Create another customized burger
        Burger veggieBurger = new Burger.BurgerBuilder("Whole Grain", "Veggie")
                .cheese("Swiss")
                .sauce("Mustard")
                .tomato(true)
                .pickles(false)
                .onions(false)
                .build();
        System.out.println(veggieBurger);
    }
}
