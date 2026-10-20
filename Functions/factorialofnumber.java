package Functions;

import java.util.Scanner;

public class factorialofnumber {
    public static int calcfactorial(int a){
        int tem=1;
        if(a<0){
            System.out.println("Invalid number");
        }else if(a==0){
            return tem;
        }else {
            for (int i = 1; i <= a; i++) {
                tem = tem * i;
            }
        }
        return tem;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int a=sc.nextInt();

        System.out.println("Factorial of the give number is :"+calcfactorial(a));

    }
}
