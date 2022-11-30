package abraDyan;

import java.util.Scanner;

public class abraMyanEsep17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");

        int num = scanner.nextInt();
        System.out.println("Juzdik san -> " + (num % 1000) / 100);

    }
}
