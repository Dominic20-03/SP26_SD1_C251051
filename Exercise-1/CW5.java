import java.util.*;

public class CW5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }

        int even = 0;
        int odd = 0;

        for (int i = 0; i < x; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
    }
}
