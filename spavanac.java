import java.util.*;
public class spavanac{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if(m-45 <0){
            if(h==0){
                m = 60+(m-45);
                System.out.println("23 " + m);
            }else{
                m = 60+(m-45);
                System.out.println(h-1 + " " + m);
            }
        }else{ 
            m = m-45;
            System.out.println(h + " " + m);
        }
    }
} 
