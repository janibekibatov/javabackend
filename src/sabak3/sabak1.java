package sabak3;

import java.util.Scanner;

public class sabak1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the height value: ");
        int height = scanner.nextInt();

        System.out.println("Type the width value: ");
        int width = scanner.nextInt();

        System.out.println("Height value " + height);
        System.out.println("Width value " + width);

        int rectangleArea = height * width;
        System.out.println(rectangleArea);
    }
}
