package Functions;

import java.util.Scanner;

public class votingeligible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age :");
        int age= sc.nextInt();

        if (age > 18){
            System.out.println("Congatulation...! You are eligible for voting");
        }else {
            System.out.println("Sorry....! You are not eligible for voting");
        }
    }
}
