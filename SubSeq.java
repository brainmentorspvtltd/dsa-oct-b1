package recursion;

public class SubSeq {

    static void subSeq(String str, String result) {
        if (str.length() == 0) {
            System.out.print(result + " ");
            return;
        }
        // Pick
        subSeq(str.substring(1), result + str.charAt(0));
        // Not Pick
        subSeq(str.substring(1), result);
    }

    public static void main(String[] args) {
        subSeq("amit", "");
    }
}
