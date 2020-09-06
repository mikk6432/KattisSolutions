import java.util.*;
public class Pet{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int rhh = 0;
        int player = 0;
        for(int j = 1; j<6; j++){
            for(int i = 0; i<4; i++){
                res = res + sc.nextInt();
            }
            if(res > rhh){ 
                rhh = res; 
                player = j;
            }
            sc.nextLine();
            res = 0;
        } 
        System.out.println(player + " " + rhh);
    }
}
