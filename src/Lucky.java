import java.util.Scanner;
public class Lucky {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers for the sum, but if one of the integers is 13 it won't count that integer and the ones after: ");
        Lucky sc = new Lucky();
        int num = sc.luckySum(input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println(num);
    }
    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }
}