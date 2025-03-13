public class Singleton {
    private static Singleton instance;
    private Integer count = 0;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void increment() {
        this.count++;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public static void main(String[] args) {
        Singleton c1 = Singleton.getInstance();
        c1.increment();
        c1.increment();
        System.out.println(c1.getCount());

        Singleton c2 = Singleton.getInstance();
        System.out.println(c2.getCount());

    }
}
