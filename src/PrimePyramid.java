import java.util.*;
public class PrimePyramid {
    static boolean isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        if(count==2)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start=2;
        for(int i=1;i<=n;i++){
            int j=0;
            while(j!=i){
                if(isPrime(start)){
                    j++;
                    System.out.print(start+" ");
                }
                start++;
            }
            System.out.println("");
        }
    }
}
