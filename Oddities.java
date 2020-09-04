import java.util.*;
public class Oddities{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(sc.hasNext()){
            int s = sc.nextInt();
            if(s%2==0){System.out.println(s + " is even");}
            else{System.out.println(s + " is odd");}
        }
        
    }
}
