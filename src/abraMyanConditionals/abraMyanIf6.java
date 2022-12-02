package abraMyanConditionals;

import java.util.Scanner;

public class abraMyanIf6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number -> ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number -> ");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println(num1 + " bigger than " + num2);
        } else {
            System.out.println(num2 + " bigger than " + num1);
        }
    }
}
