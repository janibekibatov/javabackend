package abraMyanCase;

import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the days of the week -> ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday " + day);
            case 2 -> System.out.println("Tuesday " + day);
            case 3 -> System.out.println("Wednesday " + day);
            case 4 -> System.out.println("Thursday " + day);
            case 5 -> System.out.println("Friday " + day);
            case 6 -> System.out.println("Saturday " + day);
            case 7 -> System.out.println("Sunday " + day);
            default -> System.out.println("There is no right answer");
        }
    }
}
