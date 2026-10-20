package Functions;

import java.util.Scanner;

public class circumtancesofcircle {
    public static double circumference(int r){
        double cir;
        cir = 2 * 3.14 * r;
        return cir;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter circle radius : ");
        int r=sc.nextInt();
        System.out.println("circumference  of circle : "+circumference(r));
    }
}
