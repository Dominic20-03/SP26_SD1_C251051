import java.util.*;

public class CW7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
