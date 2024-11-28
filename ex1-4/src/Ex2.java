import java.util.Scanner;

public class Ex2 {
    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(input.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(input.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("String: \"" + input + "\" is palindrome.");
        } else {
            System.out.println("String: \"" + input + "\" isn't palindrome.");
        }

        scanner.close();
    }
}
