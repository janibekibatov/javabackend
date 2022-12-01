package sabak2;

import java.util.Scanner;

public class compareAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sizdin jasynyz? ");
        int age = scanner.nextInt();
        if(age > 18) {
            System.out.println("Sizge kiruge ruksat");
        }

        System.out.println("Kelesi matin");

//        else {
//            System.out.println("Sizge kiruge ruksat jok");
//        }

    }
}
