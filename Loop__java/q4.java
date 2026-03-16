package Loop__java;
import java.util.*;

/* 
public class q4 {
    //print the sum of first n natural nunber
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i = 1; i<=n; i++){
            sum= sum+i;
        }
        System.out.println("sum: "+ sum);
    }
    
}
*/

public class q4 {
    //print the sum of first n natural nunber using while loop
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i<=n){
            sum= sum+i;
            i++;
        }
        System.out.println("sum: "+ sum);
    }
}
