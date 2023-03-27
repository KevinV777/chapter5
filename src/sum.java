import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("Enter a positive integer to get the sum of the digits: ");
        sum sc = new sum();
        int input = sc.sumDigits(temp.nextInt());
        System.out.println("Sum of the digits are: " + input);
    }
    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }
}
