import java.util.*;
public class HeartRate{
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
            for(int i=0; i<n; i++){
                double b = sc.nextDouble();
                double p = sc.nextDouble();
                double calc = (60.0000*b)/p;
                double min = calc-60.0000/p; 
                double max = calc+60.0000/p;
                System.out.println(min + " " + calc + " " + max);
        } 
    }
} 
