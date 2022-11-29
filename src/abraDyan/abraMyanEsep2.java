package abraDyan;

import java.util.Scanner;

public class abraMyanEsep2 {
    public static void main(String[] args){
        Scanner tonna = new Scanner(System.in);
        System.out.println("Type kg value: ");
        int kg = tonna.nextInt();
        int t = kg / 1000;
        System.out.println("kg = " + kg + "kg " + t + "tonna " + (kg%1000) + "kg");
    }
}
