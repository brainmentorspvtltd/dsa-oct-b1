package recursion;

public class SumOfDigit {
    static int sumOfDigit(int num) {
        if (num == 0) {
            return 0; // sum init
        }

        return sumOfDigit(num / 10) + num % 10;
        // int sum = sumOfDigit(num / 10);
        // return sum + num % 10;
    }

    static void sumOfDigit(int num, int sum) {
        // base case
        if (num == 0) {
            System.out.println(sum);
            return;
        }

        sumOfDigit(num / 10, sum + num % 10);
        // Logic
        // int lastDigit = num % 10;
        // sumOfDigit(num / 10, sum + lastDigit);
    }

    public static void main(String[] args) {
        sumOfDigit(123, 0);
        int r = sumOfDigit(1234);
        System.out.println(r);
    }
}
