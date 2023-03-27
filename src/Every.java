import java.util.Scanner;
public class Every {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string, expect every other character to be printed back: ");
        Every sc = new Every();
        String str = sc.everyOther(input.nextLine());
        System.out.println(str);
    }
    public String everyOther(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }
}