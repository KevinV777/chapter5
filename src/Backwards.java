import java.util.Scanner;
public class Backwards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to find out if it is a palindrome: ");
        Backwards sc = new Backwards();
        boolean value = sc.hasPalindrome(input.nextLine());
        System.out.println(value);
    }
    public boolean hasPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }
        return false;
    }
}