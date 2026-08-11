import java.util.Scanner;

public class DataTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        if (input.contains(".")) {
            System.out.println("It is a float data type.");
        } else {
            long number = 0;

            for (int i = 0; i < input.length(); i++) {
                char letter = input.charAt(i);
                int digit = letter - '0';
                number = (number * 10) + digit;
            }

            if (number >= -128 && number <= 127) {
                System.out.println("It is a byte data type.");
            } else if (number >= -32768 && number <= 32767) {
                System.out.println("It is a short data type.");
            } else if (number >= -2147483648 && number <= 2147483647) {
                System.out.println("It is an int data type.");
            } else {
                System.out.println("It is a long data type.");
            }
        }
    }
}
