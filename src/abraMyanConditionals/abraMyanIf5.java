package abraMyanConditionals;

import java.util.Scanner;

public class abraMyanIf5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number -> ");
        int a1 = scanner.nextInt();
        System.out.print("Enter a number -> ");
        int a2 = scanner.nextInt();
        System.out.print("Enter a number -> ");
        int a3 = scanner.nextInt();

        int sum = 0;
        int minusSum = 0;
        if(a1 >= 0) {
            System.out.println("Durys san -> " + (sum += 1));
        } else {
            System.out.println("Teris san -> " + (minusSum += 1));
        }
        if(a2 >= 0) {
            System.out.println("Durys san -> " + (sum += 1));
        } else {
            System.out.println("Teris san -> " + (minusSum += 1));
        }
        if(a3 >= 0) {
            System.out.println("Durys san -> " + (sum += 1));
        } else {
            System.out.println("Teris san -> " + (minusSum += 1));
        }
    }
}
