import java.util.Scanner;
public class SumOfLastTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to print the Fibonacci value of that number: ");
        SumOfLastTwo sc = new SumOfLastTwo();
        int num = sc.fibonacci(input.nextInt());
        System.out.println(num);
    }
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }
}