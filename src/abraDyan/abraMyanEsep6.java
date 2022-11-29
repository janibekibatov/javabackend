package abraDyan;

import java.util.Scanner;

public class abraMyanEsep6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eki tanbaly san engiz: ");
        int a = scanner.nextInt();

        System.out.println("Birinshi san: " + a / 10);
        System.out.println("Ekinshi san: " + a % 10);
    }
}
