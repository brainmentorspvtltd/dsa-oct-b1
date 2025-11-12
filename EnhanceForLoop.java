import java.util.ArrayList;

public class EnhanceForLoop {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(100);
        list.add(10);
        list.add(20);
        list.add(30);
        list.forEach(e -> System.out.println(e));
        int q[] = new int[10];
        int[] q2 = new int[10];
        int q3[] = new int[] { 10, 20, 30, 40 };
        int arr[] = { 10, 20, 30, 40, 50 };
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
