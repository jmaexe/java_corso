public class BoxedInteger {
    private Integer number;

    public BoxedInteger(Integer number) {
        this.number = number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public static void main(String[] args) {
        BoxedInteger bn = new BoxedInteger(42);
        System.out.println(bn.getNumber());
        bn.setNumber(99);

        System.out.println(bn.getNumber());
    }
}
