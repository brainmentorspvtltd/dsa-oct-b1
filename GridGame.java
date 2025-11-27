package recursion;

public class GridGame {
    static void gridGame(int startRow, int startCol,
            int endRow, int endCol, String result) {
        if (startRow == endRow && startCol == endCol) {
            System.out.println(result);
            return;
        }
        // Negative Base case
        if (startCol > endCol || startRow > endRow) {
            return;
        }

        // column move - right move
        gridGame(startRow, startCol + 1, endRow, endCol, result + "R");
        gridGame(startRow + 1, startCol, endRow, endCol, result + "D");
    }

    public static void main(String[] args) {
        gridGame(0, 0, 0, 0, "");
    }
}
