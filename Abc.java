import java.math.BigInteger;

public class Abc {

    static int show() {
        int x = 10;
        int y = 20;
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        System.out.println(new Abc())`;
        BigInteger bb = new BigInteger("99999999999999");
        BigInteger ww = bb;
        int price = 10000;
        int prices[] = { 10000, 20000, 30000 };
        System.out.println(prices);
        int prices2[] = prices;
        prices2[0] = 888888;
        System.out.println(prices[0] + " " + prices2[0]);
        int x = 10;
        int y = x;
        y = y + 100;
        y = y + 200;
        System.out.println(y + 90);
        System.out.println(y);
        char choice = 'न';
        System.out.println(choice);
        // camelCase = variables + methods
        // alphanumeric
        // no keyword
        // meaningful or fill
        int savingAccountNumber = 1001;

        // variables
        BigInteger b = new BigInteger("987649867894576895479867459867984576897459867894569795469874");
        BigInteger b2 = new BigInteger("987649867894576895479867459867984576897459867894569795469874");
        BigInteger b3 = b2.add(b);
        System.out.println(b3);
        long r8 = 6867868764445646L;
        int a = 10; // int literal
        long ff = 10000L; // long literal
        var b9 = 20;

        float r = 10.20F; // float literal
        float t = (float) 10.2000;
        double r2 = 1000.222;

    }
}
