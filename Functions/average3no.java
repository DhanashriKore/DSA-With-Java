package Functions;

import java.util.Scanner;

public class average3no {
    public static int average(int a,int b, int c){
        int avg;
        avg=a+b+c;
        return avg/3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();

        System.out.println("Avarage of of 3 numbers : "+average(a,b,c));

    }
}
