package abraMyanConditionals;

import java.util.Scanner;

public class abraMyanIf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number -> ");
        int num = scanner.nextInt();

        if(num >= 0) {
            System.out.println(num += 1);
        } else {
            System.out.println(num -= 2);
        }
    }
}
