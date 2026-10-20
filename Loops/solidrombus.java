package Loops;

public class solidrombus {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i ; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        Hollow Rombus
        System.out.println();
        int m=5;
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= m; j++) {
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
