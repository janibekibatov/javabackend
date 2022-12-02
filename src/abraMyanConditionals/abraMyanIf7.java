package abraMyanConditionals;

import java.util.Scanner;

public class abraMyanIf7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number -> ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number -> ");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println(num2 + " less than " + num1);
        } else {
            System.out.println(num1 + " less than " + num2);
        }
    }
}
