import java.util.*;
public class Aaah{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String y = sc.nextLine();
        if(n.length()>=y.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}
