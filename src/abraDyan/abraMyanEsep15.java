package abraDyan;

import java.util.Scanner;

public class abraMyanEsep15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("3 tanbaly san engiz: ");

        int num = scanner.nextInt();
        int firstNum = num / 100;
        int secondNum = (num % 100) / 10;
        int thirdNum = num % 10;

        System.out.println(secondNum + "" + firstNum + "" + thirdNum);
    }
}
