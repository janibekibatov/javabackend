package abraDyan;

import java.util.Scanner;

public class abraMyanEsep8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eki tanbaly san engiz: ");

        int a = scanner.nextInt();
        int firstNum = a / 10;
        int secondNum = a % 10;
        int thirdNum = firstNum + secondNum * 10;
        System.out.print(thirdNum);
    }
}
