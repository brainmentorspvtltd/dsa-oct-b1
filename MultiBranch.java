package recursion;

public class MultiBranch {
    static void tree(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println("Pre Call " + num);
        tree(num - 1);
        System.out.println("Post Call (num-1) " + num);
        tree(num - 2);
        System.out.println("Post Call (num-2) " + num);
        tree(num - 3);
        System.out.println("Post Call (num-3)" + num);
        tree(num - 4);
        System.out.println("Post Call (num-4)" + num);
    }

    public static void main(String[] args) {
        tree(5);
    }
}
