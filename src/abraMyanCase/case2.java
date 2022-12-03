package abraMyanCase;

import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bagany engiz -> ");
        int K = scanner.nextInt();

        switch (K) {
            case 1 -> System.out.println("Jaman " + K);
            case 2 -> System.out.println("Kanagattandyrylmagan " + K);
            case 3 -> System.out.println("Kanagattandyrarlyk " + K);
            case 4 -> System.out.println("Jaksy " + K);
            case 5 -> System.out.println("Keremet " + K);
            default -> System.out.println("Kate engizdiniz!!!");
        }
    }
}
