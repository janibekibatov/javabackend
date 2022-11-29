package abraDyan;

import java.util.Scanner;

public class abraMyanEsep3 {
    public static void main(String[] args) {
        Scanner kylobite = new Scanner(System.in);
        System.out.println("Type kilobyte: ");
        int kb = kylobite.nextInt();
        int b = kb / 1024;
        System.out.println("kylobite = " + kb + "bite " + b + "kylobite "+ (kb%1024) + "bite");
    }
}
