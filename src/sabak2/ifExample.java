package sabak2;

import java.util.Scanner;

public class ifExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        if(age < 0) {
            System.out.println("It's impossible minus age");
        } else {
            if(age > 18 && age < 25) {
                System.out.println("You are young");
            } else if(age > 25) {
                System.out.println("You are old!");
            } else {
                System.out.println("You are younger than 18");
            }
        }


    }
}
