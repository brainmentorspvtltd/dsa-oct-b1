import java.math.BigDecimal;
import java.math.BigInteger;

public class StringDemo {
    public static void main(String[] args) {
        // Big Types
        BigDecimal bd = new BigDecimal("6456456546456456456.53453453453455");
        BigInteger bd2 = new BigInteger("534543534534534534534534534534543534534535");
        BigInteger bd3 = new BigInteger("5345345345345345345347675656756867867");
        BigInteger bd4 = bd2.add(bd3);
        // StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder("Amit");
        sb2.ensureCapacity(10000);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        sb2.append("hfgkdjhgjkdhgkjhfdjkghjdfgkhdfkghdfkghdfkjhgkfdjhgkjd");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        sb2.append("hfghfg");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println("**********************************");
        sb2.append("select * from products");
        String sql = "select * from products where type='mobile' and brand='apple' and ram=1";
        String h9 = "Amit";
        h9 = h9 + "Srivastava";
        h9 = "Amit";
        // System.out.println(h9 + "Srivastava");
        System.out.println(h9);

        String gg = "Ram";
        System.out.println(gg.length());
        System.out.println(gg.toUpperCase());
        System.out.println(gg);
        // String n = "Amit"; // 1 or 0 object
        String n = "Amit".intern(); // String Literal - 1 way
        String n2 = "Amit";
        n2 = "Ramesh";
        // String n3 = new String("Amit"); // 2 or 1
        String n3 = new String("Amit").intern(); // 2nd way
        System.out.println(n == n2);
        System.out.println(n == n3);

    }
}
