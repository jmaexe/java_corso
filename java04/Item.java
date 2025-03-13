public class Item {
    private final String id;

    public Item(String id) {
        this.id = id;
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing Item " + id);
        super.finalize();
    }
}
