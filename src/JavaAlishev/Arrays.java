package JavaAlishev;

public class Arrays {
    public static void main(String[] args) {
        int number = 10; //primitive
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i*10;
        }

        for(int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }
        System.out.println();
        int[] numbers1 = {1, 2, 3};
        for(int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }
}
