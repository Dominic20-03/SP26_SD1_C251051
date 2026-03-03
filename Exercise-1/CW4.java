import java.util.*;

public class CW4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < x; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Average Number : " + average);
    }
}
