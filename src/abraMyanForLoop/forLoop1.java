package abraMyanForLoop;

import java.util.Scanner;

public class forLoop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter K value -> ");
        int K = scanner.nextInt();
        System.out.print("Enter N value -> ");
        int N = scanner.nextInt();

        for(int i = 0; i < N; i++) {
            System.out.println(K);
        }
    }
}
