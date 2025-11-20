package recursion;

public class PinCodeGen {

    static void genPinCode(int range, String result) {
        if (range == 0) {
            System.out.print(result + ",");
            return;
        }
        for (int i = 0; i <= 9; i++) {
            genPinCode(range - 1, result + i);
        }
        // genPinCode(range - 1, result + "0");
        // genPinCode(range - 1, result + "1");
        // genPinCode(range - 1, result + "2");
        // genPinCode(range - 1, result + "3");
        // genPinCode(range - 1, result + "4");
        // genPinCode(range - 1, result + "5");
        // genPinCode(range - 1, result + "6");
        // genPinCode(range - 1, result + "7");
        // genPinCode(range - 1, result + "8");
        // genPinCode(range - 1, result + "9");
    }

    public static void main(String[] args) {
        int range = 10; // 3-6
        // Pincode - 0 - 9
        genPinCode(range, "");
    }
}
