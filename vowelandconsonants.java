import java.util.Scanner;
public class vowelandconsonants{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }
        System.out.println("Number of vowels in String: " + vowels);
        System.out.println("Number of consonants in String: " + consonants);
    }
}
