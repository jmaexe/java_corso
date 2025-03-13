public class BoxedPositiveInteger {
    private Integer number;

    public BoxedPositiveInteger(Integer number) {
        if (number < 0)
            throw new IllegalArgumentException("Number cannot be negative");
        this.number = number;
    }

    public void setNumber(Integer number) {
        if (number < 0)
            throw new IllegalArgumentException("Number cannot be negative");
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public static void main(String[] args) {
        BoxedPositiveInteger bn = new BoxedPositiveInteger(10);
        System.out.println(bn.getNumber());
        try {
            bn = new BoxedPositiveInteger(-10);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            bn.setNumber(-5);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
