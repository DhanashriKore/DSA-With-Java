package BasicJAVA;
import java.util.Scanner;
public class Personal_Profile_Card {
    public static void main(String[] args) {
        //Question 5
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        System.out.println("Enter your age :");
        int age=sc.nextInt();
        System.out.println("Enter your qualification :");
        String qaul=sc.next();
        System.out.println("Enter your one skill :");
        String skill=sc.next();
        System.out.println("Enter Your Goal :");
        String goal=sc.nextLine();

        System.out.println("==========================================================");
        System.out.println("My Profile");
        System.out.println("==========================================================");
        System.out.println("Name          :"+name);
        System.out.println("Age           :"+age);
        System.out.println("Qualification :"+qaul);
        System.out.println("Skill         :"+skill);
        System.out.println("Goal          :"+goal);
        System.out.println("==========================================================");

    }

}
