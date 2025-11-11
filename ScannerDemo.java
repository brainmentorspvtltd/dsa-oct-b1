import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Id");
        int id = scanner.nextInt();
        // scanner.nextLine();
        System.out.println("Enter the Name");
        // String name = scanner.nextLine();
        String name = scanner.next();
        System.out.println(name + " " + id);
        scanner.close();

        // scanner = new Scanner(System.in);
        // System.out.println("Enter the City");
        // String city = scanner.next();
        // System.out.println("City is " + city);
        // scanner.close();
    }
}
