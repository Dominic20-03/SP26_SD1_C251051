import java.util.*;

public class CW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }

        int smallest_number = Integer.MAX_VALUE;

        for (int i = 0; i < x; i++) {
            if (arr[i] < smallest_number) {
                smallest_number = arr[i];
            }
        }

        System.out.println("Smallest Number : " + smallest_number);
    }
}
