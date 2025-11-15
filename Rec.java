package recursion;

public class Rec {

    static void show(int n) {
        // Base Case or Termination Case
        if (n == 0) {
            return;
        }
        System.out.println("Amit " + n);
        // n--;
        show(n - 1);
        System.out.println("Srivastava " + n);
        // show(n);
    }

    public static void main(String[] args) {
        show(5);
    }
}
