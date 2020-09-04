import java.util.*;
public class pot{
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        double result = 0;
            for(int i=0; i<n; i++){
                sc.nextLine();
                int p = sc.nextInt();
                int lastDigit = p % 10;
                result = result + (Math.pow(p/10, lastDigit));
        } 
        System.out.println((int) result);
    }
} 
