import java.util.Scanner;
public class pyramid3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int column=1+2*(row-1);
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(j>=(row+1)-i && j<=i+(row-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}