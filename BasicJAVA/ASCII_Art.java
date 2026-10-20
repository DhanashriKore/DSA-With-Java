package BasicJAVA;

public class ASCII_Art {
    public static void main(String[] args) {
        //Question 4
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

        int a = 10;
        double b = 20.5;

        System.out.println(a + b);
    }
}
