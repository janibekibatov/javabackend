package abraDyan;

import java.util.Scanner;

public class abraMyanEsep7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eki tanbaly san engiz: ");

        int a = scanner.nextInt();
        int firstNumber = a / 10;
        int secondNumber = a % 10;

        System.out.println("Sum of two numbers: " + (firstNumber + secondNumber));
        System.out.println("Multiple of two numbers: " + (firstNumber * secondNumber));
    }
}
