import java.util.Scanner;

public class Ex4 {
    public static String formatPhoneNumber(String input) {
        String digits = input.replaceAll("\\D", "");
        if (digits.length() != 10) {
            throw new IllegalArgumentException("Phone number must have 10 digits.");
        }

        return String.format("(%s) %s-%s",
                digits.substring(0, 3),
                digits.substring(3, 6),
                digits.substring(6));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your phone number:");
        String input = scanner.nextLine();

        try {
            String formattedPhoneNumber = formatPhoneNumber(input);
            System.out.println("Formatted phone number: " + formattedPhoneNumber);
        } catch (IllegalArgumentException e) {
            System.out.println("Errors: " + e.getMessage());
        }
        scanner.close();
    }
}
