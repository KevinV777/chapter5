import java.util.Scanner;
public class Missing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string, expect the first three characters to be removed: ");
        Missing sc = new Missing();
        String str = sc.missingFront(input.nextLine());
        System.out.println(str);
    }
    public String missingFront(String str)
    {
        return str.substring(3);
    }
}
