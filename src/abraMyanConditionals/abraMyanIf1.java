package abraMyanConditionals;

import java.util.Scanner;

public class abraMyanIf1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number -> ");
        int num = scanner.nextInt();

        if(num >= 0) {
            System.out.println(num = num + 1);
        }
    }
}
