package Loops;

public class halfpyramidwithnumber {
    public static void main(String[] args) {
//     OUTPUT
//        1
//        22
//        333
//        4444
//        55555
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
//        OUTPUT
//        1
//        12
//        123
//        1234
//        12345

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // her diffence is what you exactly going to print okay

    }
}
