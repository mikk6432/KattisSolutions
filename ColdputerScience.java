import java.util.*;
public class ColdputerScience{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        while(n>0){
             if( sc.nextInt() < 0){r++; n = n-1;}
             else{n = n-1;}
        } 
        System.out.print(r);
    }
}
