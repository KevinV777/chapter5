import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string, expect the first character and the last character to be swapped: ");
        Swap sc = new Swap();
        String str = sc.swapEnds(input.nextLine());
        System.out.println(str);
    }
    public String swapEnds(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            return last + middle + first;
        }
    }
}