import java.util.*;
public class Median {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
            System.out.println(n%2==0?"median= "+((array[n/2]+array[n/2-1])/2):"median= "+array[n/2]);
    }
}