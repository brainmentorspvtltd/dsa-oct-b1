package recursion;

public class Pattern {
    static void printStar(int numberOfStars) {
        if (numberOfStars == 0) {
            return;
        }
        System.out.print("*");
        printStar(numberOfStars - 1);
    }

    static void printLine(int numberOfRows) {
        // base case
        if (numberOfRows == 0) {
            return;
        }

        printLine(numberOfRows - 1);
        printStar(numberOfRows);
        System.out.println(); // print new line
    }

    public static void main(String[] args) {
        printLine(5);
    }
}
