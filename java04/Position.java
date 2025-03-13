public class Position {
    int row, col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "(" + row + "," + col + ")";
    }
}
