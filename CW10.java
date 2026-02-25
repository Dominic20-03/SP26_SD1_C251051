import java.util.*;

public class CW10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String upper = str.toLowerCase();
        String lower = str.toUpperCase();

        System.out.println(upper);
        System.out.println(lower);
    }
}
