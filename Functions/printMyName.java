package Functions;

import java.util.Scanner;

public class printMyName {
    public static void myname(String name){
        System.out.println(name);
        return;
    }
    public static int calcSum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static int calProduct(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name :");
        String name=sc.next();

        myname(name);
        System.out.println("Enter 2 number :");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=calcSum(a,b);
        System.out.println("Sum of 2 numbers is :"+sum);

        System.out.println("Product of 2 numbers :" +calProduct(a,b));

    }
}
