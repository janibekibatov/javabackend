package sabak2;

import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items sell out ->");
        int sales = scanner.nextInt();
        int rate = 1000;
        int bonus = 250;

        if(sales > 10) {
            System.out.println("Your bonus " + (rate+bonus));
        } else {
            System.out.println("You do not have bonus");
        }
    }
}
