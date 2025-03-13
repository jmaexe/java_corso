public class MatrixRotationTest {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 4);
        matrix.print();
        System.out.println("After");
        matrix.rotate90Clockwise();
        // matrix.print();
    }
}
