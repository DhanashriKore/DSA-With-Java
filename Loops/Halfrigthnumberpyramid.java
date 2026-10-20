package Loops;

public class Halfrigthnumberpyramid {
    public static void main(String[] args) {
        //OUTPUT
//    1
//   22
//  333
// 4444
//55555
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

//        OUTPUT
//    1
//   12
//  123
// 1234
//12345
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
