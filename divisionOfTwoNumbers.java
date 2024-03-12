import java.util.Scanner;
public class divisionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        int numerator = sc.nextInt();
        System.out.println("Enter the denominator: ");
        int denominator = sc.nextInt();
        divideNumbers(numerator, denominator);
    }
    public static void divideNumbers(int x, int y) {
        try {
            int res = x/y;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }
    }
}
