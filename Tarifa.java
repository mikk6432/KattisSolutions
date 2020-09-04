import java.util.*;
public class Tarifa{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        int res = x;
        while(sc.hasNextInt()){
            res = res + (x - sc.nextInt());
            sc.nextLine();
        }
        System.out.println(res);
    }
}
