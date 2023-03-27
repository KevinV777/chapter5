import java.util.Scanner;
public class Birthday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        Birthday sc = new Birthday();
        String str = sc.birthdayName(input.nextLine());
        System.out.println(str);
    }
    public String birthdayName(String name){
        return ("Happy Birthday " + name + "!");
    }

}
