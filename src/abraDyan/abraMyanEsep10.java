package abraDyan;

import java.util.Scanner;

public class abraMyanEsep10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("3 tanbaly san engiz: ");

        int num = scanner.nextInt();
        int thirdNum = num % 10;
        int secondNum = (num % 100) / 10;

        System.out.print(thirdNum + "" +  secondNum);
    }
}
