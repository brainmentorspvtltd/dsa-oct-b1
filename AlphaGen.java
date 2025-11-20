package recursion;

public class AlphaGen {
    static void printAlphaComb(int range, String result) {
        if (range == 0) {
            System.out.print(result + ",");
            return;
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == '0' || ch == 'U') {
                printAlphaComb(range - 1, result + ch);
            }
        }
    }

    public static void main(String[] args) {
        printAlphaComb(5, "");
    }
}
