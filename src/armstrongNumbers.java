import java.util.Scanner;

public class armstrongNumbers {
    static int sumNumbers(int n,int l){
        int sum=0;
        while(n>0){
            sum +=Math.pow((n%10),l);
            n /=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end= sc.nextInt();
        String len="";
        for(int i=start;i<=end;i++){
            len=String.valueOf(i);
            int a=sumNumbers(i,len.length());
            if(a==i)
                System.out.print(i+" ");
        }
    }
}
