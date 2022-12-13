package sabak2;

public class Kairat {
    public static void main(String[] args) {
//        int[] kairat1 = new int[11];
//        int kairat2[] = new int[11];

//        int[] kairat1 = {5, 7, 9, -5, 6};
//        int kairat2[] = new int[] {5, 7, 9, -5, 6};
//
//        int sum = 0;
//        for(int i = 0; i < kairat1.length; i++) {
//            sum = sum + kairat1[i];
//            System.out.println("Sum -> " + sum);
//        }

//        System.out.println("Full sum -> " + sum);

        // eki olshemdi massiv
        int[][] matrix = {{1}, {2, 3},{4, 5, 6}, {7, 42, 9, 8}};
        System.out.println("matrix[3][1] " + matrix[3][1]);

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.println("matrix["+i+"]["+j+"] = "+ matrix[i][j]);
            }
        }

    }
}
