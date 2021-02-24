import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split("\\s");
        StringBuilder reversed=new StringBuilder();
        for(String s:words){
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            reversed.append(sb+" ");
        }
        System.out.println(reversed);
    }
}
