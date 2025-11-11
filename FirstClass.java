class P {
    static void show() {
        System.out.println("P Show....");
    }
}

class SecondClass {
    static void main(int x) {
        System.out.println("int main...");
    }

    static void main() {
        System.out.println("Main ....");
    }

    static public void main(String... a) {
        P.show();
        // FirstClass.main(10);
        main();
        System.out.println("Hello Java");
    }
}