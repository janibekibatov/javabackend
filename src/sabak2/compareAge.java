package sabak2;

import java.util.Scanner;

public class compareAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Value engiz -> ");
//        int value = scanner.nextInt();

        // do while
        int i = 0;
        int sum = 0;
        do {
            sum = sum + i;
            i++;
        } while(i <= 10);

        System.out.println("Sum using do while " + sum);

        // while
        i = 0;
        sum = 0;
        while(i <= 10) {
            sum += i;
            i++;
        }

        System.out.println("Sum using while -> " + sum);

        // for loop
        int summa = 0;
        for(int j = 0; j <= 10; j++) {
            summa += j;

        }
        System.out.println("Sum using for loop -> " + summa);

//        int i = 0;
//        while(i <= 10) {
//            System.out.println("Hello " + i);
//            i += 3;
//        }

//        switch (value) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//                System.out.print("1 men 4 arasynda san " + value);
//                break;
//            case 9:
//                System.out.print("9 sany " + value);
//                break;
//            case 0:
//                System.out.print("0 sany " + value);
//                break;
//            default:
//                System.out.print("Eshkandai shartka kelmegen san " + value);
//
//        }

//        System.out.print("Sizdin jasynyz? ");
//        int age = scanner.nextInt();
//        if(age > 18) {
//            System.out.println("Sizge kiruge ruksat");
//        }
//        System.out.println("Kelesi matin");

//        else {
//            System.out.println("Sizge kiruge ruksat jok");
//        }
//        System.out.println("San engiz -> ");
//        int value = scanner.nextInt();
//        if(value >= 1 && value <= 4) {
//            System.out.println("1 men 4 arasynda san " + value);
//        } else if(value == 9) {
//            System.out.println("9 sany " + value);
//        } else if(value == 0) {
//            System.out.println("0 sany " + value);
//        } else {
//            System.out.println("Eshkandai shartka kelmegen san " + value);
//        }

//        System.out.println("A manin engiz -> ");
//        int a = scanner.nextInt();
//
//        if (a % 2 == 0) {
//            System.out.println(a + " = jup san");
//        } else {
//            System.out.println(a + " = tak san");
//        }

    }
}
