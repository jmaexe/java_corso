public class Pizza {
    private int size;
    private boolean cheese, pepperoni, bacon;

    public Pizza(int size) {
        this.size = size;
    }

    public Pizza(int size, boolean cheese) {
        this.size = size;
        this.cheese = cheese;
    }

    public Pizza(int size, boolean cheese, boolean pepperoni) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
    }

    public Pizza(int size, boolean cheese, boolean pepperoni, boolean bacon) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.bacon = bacon;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", size=" + size + ", cheese=" + cheese + ", pepperoni=" + pepperoni
                + ", bacon=" + bacon;
    }
}
