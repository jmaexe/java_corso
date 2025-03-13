import java.util.Arrays;

public class Matrix {
    private int rows;
    private int cols;
    private int[][] matrix;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
        int n = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = n;
                n++;
            }
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Position find(int target) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (target == matrix[i][j])
                    return new Position(i, j);
            }
        }
        return new Position(-1, -1);
    }

    public void rotate90Clockwise() {
        int[] newMatrix = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < cols; i++) {
            for (int j = rows - 1; j >= 0; j--) {
                newMatrix[index] = matrix[j][i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newMatrix));
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = newMatrix[index];
                index++;
            }
        }

    }
}
