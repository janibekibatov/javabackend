package abraDyan;

import java.util.Scanner;

public class abraMyanEsep4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A manin engiziniz: ");
        int a = scanner.nextInt();

        System.out.print("B manin engiziniz: ");
        int b = scanner.nextInt();

        System.out.print("A boiyndagy B mani = " + a / b);
    }
}
