public class BoxedExistingInteger {
    private Integer number;

    public BoxedExistingInteger(Integer number) {
        if (number == null)
            throw new IllegalArgumentException("Number cannot be null");
        this.number = number;
    }

    public void setNumber(Integer number) {
        if (number == null)
            throw new IllegalArgumentException("Number cannot be null");
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public static void main(String[] args) {
        BoxedExistingInteger bn = new BoxedExistingInteger(42);
        System.out.println(bn.getNumber());

        try {
            bn = new BoxedExistingInteger(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            bn.setNumber(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
