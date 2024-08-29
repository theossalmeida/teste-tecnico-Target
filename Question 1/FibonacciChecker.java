import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number (int) to check if it's in Fibonacci sequence: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isFibonacci(number)) {
            System.out.println(number + " is in Fibonacci sequence.");
        } else {
            System.out.println(number + " isn't in Fibonacci sequence.");
        }
    }

    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }

        int prev = 0;
        int current = 1;

        while (current < number) {
            int next = prev + current;
            prev = current;
            current = next;
        }

        return current == number;
    }
}