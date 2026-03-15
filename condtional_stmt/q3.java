package condtional_stmt;
import java.util.*;
public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if (a==b){
            System.out.print("Both a & b are equal");
        }
        else if (a>b) {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is lesser than b");
        }
    }    
}
