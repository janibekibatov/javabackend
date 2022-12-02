package abraMyanConditionals;

import java.util.Scanner;

public class abraMyanIf8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number -> ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number -> ");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.print(num1 + ","+ num2);
        } else {
            System.out.print(num2 + "," + num1);
        }
    }
}
