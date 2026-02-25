import java.util.*;

public class CW8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        int size = str.length();
        boolean f = true;

        for (int i = 0; i < (size / 2); i++) {
            if (str.charAt(i) != str.charAt(size - i - 1)) {
                f = false;
            }
        }

        if (f) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
