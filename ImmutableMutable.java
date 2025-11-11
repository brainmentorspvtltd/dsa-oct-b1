import java.util.LinkedList;

public class ImmutableMutable {
    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();
        // int x = 10;
        // int y = x;
        // System.out.println(y + 10);
        // System.out.println(y);
        // y = y + 20;
        // System.out.println(x + " " + y);
        String g6 = "1000";
        int k9 = Integer.parseInt(g6);
        double nn = 90.20; // data
        Double tt = 100.20; // data + methods
        String b4 = tt.toString();
        int b2 = tt.intValue();

        int arr[] = { 10, 20, 30, 40 };
        int b[] = arr;
        b[0] = 7777;
        System.out.println(arr[0] + "   " + b[0]);
    }
}
