import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to find out if it is a power of two: ");
        Power sc = new Power();
        boolean value = sc.powerOfTwo(input.nextInt());
        System.out.println(value);
    }
    public boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else {
            do {
                if (n == 1) {
                    return true;
                } else if (n % 2 != 0) {
                    return false;
                }
                n /= 2;
            } while (true);
        }
    }
}