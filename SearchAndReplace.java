package recursion;

public class SearchAndReplace {
    static String searchAndReplace(String str, char search, char replace) {
        // base case
        if (str.length() == 0) {
            return "";
        }
        // make string small - str.substring(1)
        String oldResult = searchAndReplace(str.substring(1), search, replace);
        if (str.charAt(0) == search) {
            return oldResult;
            // return replace + oldResult;
        } else {
            return str.charAt(0) + oldResult;
        }
    }

    public static void main(String[] args) {
        String result = searchAndReplace("Hello", 'l', 'x');
        System.out.println(result);
    }
}
