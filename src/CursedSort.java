import java.util.Scanner;
import java.util.Arrays;
public class CursedSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int[] temp=new int[n/2];
        int position=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                temp[position++]=array[i];
            }
        }
        Arrays.sort(temp);
        position=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                array[i]=temp[position++];
            }
        }
        for(int i: array){
            System.out.print(i+" ");
        }
    }
}
