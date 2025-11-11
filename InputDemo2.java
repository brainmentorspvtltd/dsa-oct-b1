import java.io.File;
import java.util.Scanner;

public class InputDemo2 {
    public static void main(String[] args) throws Exception {
        // c:\\abcd\\A.java
        Scanner scanner = new Scanner(new File("/Users/amitsrivastava/Documents/java-dsa-ims-nov/InputDemo2.java"));
        // Scanner scanner = new Scanner("Hello How are You");
        int wordCount = 0;
        while (scanner.hasNext()) {
            wordCount++;
            System.out.println(scanner.next());
        }
        System.out.println("Total Words " + wordCount);
        scanner.close();
    }
}
