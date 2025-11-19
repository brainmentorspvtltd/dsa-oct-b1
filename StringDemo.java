package recursion;

public class StringDemo {
    public static void main(String[] args) {
        String q = "Amit";
        String q2 = "Amit";
        int gg = 10;
        int gg2 = 10;
        // System.out.println(gg == gg2);
        // System.out.println(q.equals(q2));
        // System.out.println(q == q2);
        StringBuilder sb = new StringBuilder("Amit");
        StringBuilder sb2 = new StringBuilder("Amit");
        System.out.println(sb.toString().equals(sb2.toString())); // false
        System.out.println(sb == sb2); // false
        // sb.append("AA");
        // q.toUpperCase();
        // q.replace('A', 'X');
    }
}
