import java.util.Scanner;
public class reverseDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any word to reverse it and double each character: ");
        reverseDouble str = new reverseDouble();
        String str2 = str.reverseDoubleChar(input.nextLine());
        System.out.println(str2);
    }
    public String reverseDoubleChar(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i) + "" + word.charAt(i);
        }
        return result;
    }
}
