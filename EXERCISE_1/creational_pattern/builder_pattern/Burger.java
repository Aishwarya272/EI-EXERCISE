public class Burger {
    private String bun;
    private String patty;
    private String cheese;
    private String sauce;
    private boolean tomato;
    private boolean pickles;
    private boolean onions;
   

    private Burger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
        this.tomato = builder.tomato;
        this.pickles = builder.pickles;
        this.onions = builder.onions;
    }

    @Override
    public String toString() {
        return "Burger [bun=" + bun + ", patty=" + patty + ", cheese=" + cheese + ", sauce=" + sauce + ", tomato=" + tomato + ", pickles=" + pickles + 
                ", onions=" + onions + "]";
    }

    // Static Builder Class
    public static class BurgerBuilder {
        private String bun;
        private String patty;
        private String cheese;
        private String sauce;
        private boolean tomato;
        private boolean pickles;
        private boolean onions;

        public BurgerBuilder(String bun, String patty) {
            this.bun = bun;
            this.patty = patty;
        }

        public BurgerBuilder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BurgerBuilder tomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public BurgerBuilder pickles(boolean pickles) {
            this.pickles = pickles;
            return this;
        }

        public BurgerBuilder onions(boolean onions) {
            this.onions = onions;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
