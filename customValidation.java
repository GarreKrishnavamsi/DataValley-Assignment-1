import java.util.Scanner;
class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}
public class Main {
    public static void checkNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try {
            checkNumber(num);
            System.out.println("Number is valid: " + num);
        } catch (CustomValidationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
