package patterns.creational.builder.telescopic_builder;

public class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;

    // Step 4: private constructor
    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }

    // Step 2: Static inner class
    public static class PizzaBuilder {
        private String size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;

        // Required field
        public PizzaBuilder(String size) {
            this.size = size;
        }

        // Optional fields
        public PizzaBuilder addCheese() {
            this.cheese = true;
            return this;
        }

        public PizzaBuilder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public PizzaBuilder addMushrooms() {
            this.mushrooms = true;
            return this;
        }

        // Step 3: Final build
        public Pizza build() {
            return new Pizza(this);
        }
    }

    public void display() {
        System.out.println("Pizza Size: " + size);
        if (cheese) System.out.println(" + Cheese");
        if (pepperoni) System.out.println(" + Pepperoni");
        if (mushrooms) System.out.println(" + Mushrooms");
    }
}
