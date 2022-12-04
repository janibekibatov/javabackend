package abraMyanForLoop;

import java.util.Scanner;

public class forLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write A -> ");
        int a = scanner.nextInt();
        System.out.print("Write B -> ");
        int b = scanner.nextInt();

        for(int i = a; i <= b; i++) {
            System.out.println(i);
        }
        int n = b - a + 1;
        System.out.println("n = " + n);
    }
}
