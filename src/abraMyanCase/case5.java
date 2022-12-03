package abraMyanCase;

import java.util.Scanner;

public class case5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number 1 till 4 -> ");
        int num = scanner.nextInt();
        System.out.print("Write the A value -> ");
        int a = scanner.nextInt();
        System.out.print("Write the B value -> ");
        int b = scanner.nextInt();

        switch(num) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a * b);
            case 4 -> System.out.println(a / b);
            default -> System.out.println("Wrong answer");
        }
    }
}
