public class BoxedImmutableInteger {

    private final Integer number;

    public BoxedImmutableInteger(Integer number) {
        this.number = number;

    }

    public Integer getNumber() {
        return number;
    }

    public static void main(String[] args) {
        BoxedImmutableInteger bn = new BoxedImmutableInteger(100);
        System.out.println(bn.getNumber());

    }
}
