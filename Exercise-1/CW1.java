import java.util.*;

public class CW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < x; i++) {
            System.out.println(arr[i]);
        }
    }
}
