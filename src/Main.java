
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");

        try {
            int number = scanner.nextInt();
            String reversedStr = reverseString(number);
            System.out.println(reversedStr);
        } catch (InputMismatchException e) {
            System.out.println("Input Error. Enter a number.");

        }
    }


    private static String reverseString(int number) {

        return new StringBuilder(String.valueOf(number)).reverse().toString();
    }
}