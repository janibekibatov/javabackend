package JavaAlishev;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you -> ");
        String age = scanner.nextLine();

        switch(age) {
            case "zero":
                System.out.println("You are born");
                break;
            case "seven":
                System.out.println("You are in school");
                break;
            case "eighteen":
                System.out.println("You are graduated school");
                break;
            default:
                System.out.println("Something wrong");
        }
    }
}
