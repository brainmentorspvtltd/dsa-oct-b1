package recursion;

public class Peterson {

    // static int peterson(int num, int org) {

    // }

    static int fact(int num) {
        if (num == 1 || num == 0) {
            return num;
        }
        return fact(num - 1) * num;
        // int result = fact(num - 1);
        // return result * num;
    }

    static void peterson(int num, int sum, int org) {
        if (num == 0) {
            System.out.println(org == sum ? "Peterson " : "Not Peterson");
            // if (org == sum) {
            // System.out.println("Peterson Number");

            // }
            return;
        }
        peterson(num / 10, sum + fact(num % 10), org);
    }

    public static void main(String[] args) {
        // int org = 145;
        // int r = peterson(org, org);
        // System.out.println(org == r ? "Peterson Number "
        // : "Not Peterson Number");
        peterson(145, 0, 145);
    }
}
