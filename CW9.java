import java.util.*;

public class CW9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String lower = str.toLowerCase();

        int size = str.length();
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < size; i++) {
            if (lower.charAt(i) == 'a' || lower.charAt(i) == 'e' || lower.charAt(i) == 'i' || lower.charAt(i) == 'o'
                    || lower.charAt(i) == 'u') {
                vowel++;
            } else {
                consonant++;
            }
        }

        System.out.println("Vowels : " + vowel);
        System.out.println("Consonants : " + consonant);
    }
}
