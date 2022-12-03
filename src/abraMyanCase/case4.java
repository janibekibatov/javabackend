package abraMyanCase;

import java.util.Scanner;

public class case4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month -> ");
        int monthNum = scanner.nextInt();

        switch(monthNum) {
            case 1 -> System.out.println("January = 31days");
            case 2 -> System.out.println("February = 28days");
            case 3 -> System.out.println("March = 31days");
            case 4 -> System.out.println("April = 30days");
            case 5 -> System.out.println("May = 31days");
            case 6 -> System.out.println("June = 30days");
            case 7 -> System.out.println("July = 31days");
            case 8 -> System.out.println("August = 31days");
            case 9 -> System.out.println("September = 30days");
            case 10 -> System.out.println("October = 31days");
            case 11 -> System.out.println("November = 30days");
            case 12 -> System.out.println("December = 31days");
            default -> System.out.println("You did wrong");
        }
    }
}
