import java.util.*;
public class Autori{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String res = "" +  n.charAt(0);
        for(int i=1; i<n.length(); i++){
            char c = n.charAt(i);    
            if(c == '-'){res += n.charAt(i+1);};
        } 
        System.out.println(res);
    }
}
