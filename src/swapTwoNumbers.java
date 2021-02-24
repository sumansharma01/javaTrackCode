import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("first_number before swap= "+a);
        System.out.println("second_number before swap= "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("first_number after swap= "+a);
        System.out.println("second_number after swap= "+b);
    }
}
