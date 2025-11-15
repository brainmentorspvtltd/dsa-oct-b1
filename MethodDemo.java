package recursion;

public class MethodDemo {

    void disp() {
        System.out.println("Non Static ");
    }

    // static method - Define
    static void show(int x, int y) {
        System.out.println("I am the Static Method");
    } // function ends - pop from the stack
      // function end } or return

    public static void main(String[] args) {
        show(10, 20); // Calling
        // When u call a function or method it push in a stack
        // along with local variables
        MethodDemo obj = new MethodDemo();
        obj.disp();
    }
}
