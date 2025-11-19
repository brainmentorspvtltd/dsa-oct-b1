package recursion;

public class ReverseString {
    static String twoPointer(char arr[], int left, int right) {
        if (left > right) {
            return new String(arr); // convert char array into string
        }
        // Swap
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return twoPointer(arr, left + 1, right - 1);
    }

    static String reverseApproach2(String str) {
        return twoPointer(str.toCharArray(), 0, str.length() - 1);
    }

    static String reverse(String str) {
        // base case - when string empty
        if (str.length() == 0) {
            return ""; // Blank String return
        }
        // make string small
        return reverse(str.substring(1)) + str.charAt(0);
        // String oldResult = reverse(str.substring(1));
        // char newResult = str.charAt(0);
        // return oldResult + newResult;
    }

    public static void main(String[] args) {
        // String rev = reverse("amit");
        String rev = reverseApproach2("amit");
        System.out.println(rev);
    }
}
