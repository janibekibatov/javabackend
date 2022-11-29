package abraDyan;

import java.util.Scanner;

public class abraMyanEsep5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A manin engiziniz: ");
        int a = scanner.nextInt();

        System.out.print("B manin engiziniz: ");
        int b = scanner.nextInt();

        System.out.print("A maninin bos emes uzundygy = " + a % b);
    }
}
