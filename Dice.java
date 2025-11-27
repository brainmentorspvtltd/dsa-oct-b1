package recursion;

public class Dice {
    static void diceGame(int start, int end, String result) {
        if (start == end) {
            System.out.print(result + ",");
            return;
        }
        if (start > end) {
            return;
        }
        for (int dice = 1; dice <= 6; dice++) {
            diceGame(start + dice, end, result + dice);
        }
        // diceGame(start + 1, end, result + "1");
        // diceGame(start + 2, end, result + "2");
        // diceGame(start + 3, end, result + "3");
        // diceGame(start + 4, end, result + "4");
        // diceGame(start + 5, end, result + "5");
        // diceGame(start + 6, end, result + "6");
    }

    public static void main(String[] args) {
        diceGame(0, 50, "");
    }
}
