import java.util.Scanner;
public class TwoStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two strings that will concatenate without the first characters: ");
        TwoStrings sc = new TwoStrings();
        String str = sc.nonStart(input.nextLine(), input.nextLine());
        System.out.println(str);
    }
    public String nonStart(String a, String b) {
        if (a.length() < 2 || b.length() < 2) {
            return "";
        } else {
            return a.substring(1) + b.substring(1);
        }
    }

}