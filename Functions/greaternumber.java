package Functions;

import java.util.Scanner;

public class greaternumber {
    public static int numb(int a, int b){
        if(a > b){
            return a;
        }else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Greater number from "+a+" and "+b+" is :"+numb(a,b));
    }
}
