package abraDyan;

import java.util.Scanner;

public class abraDyanEsep1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type L value: ");
        int l = scanner.nextInt();
        int lm = l / 100;

        System.out.println("l =" + l +" cm " + lm + "metr"+(l%100) + "cm");
    }
}
