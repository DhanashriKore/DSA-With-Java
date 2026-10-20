package Functions;

import java.util.Scanner;

public class sumofoddno {
    public static int sum(int n){
        int temp=0;
        for (int i = 0; i < n; i++) {
            if(i % 2 != 0) {
                temp = temp + i;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        System.out.println("Sum of odd number till the 1 to "+n+" : "+sum(n));
    }
}
