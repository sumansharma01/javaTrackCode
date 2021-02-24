import java.util.Scanner;
public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        if(number==0){
            System.out.println(0);
        }else{
            System.out.println(number%9==0 && number!=0 ?"9":number%9);
        }

    }
}
