package condtional_stmt;
import java.util.*;
public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //p2 odd and even checker

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n%2 == 0){
            System.out.print("The number is even");
        }
        else{
            System.out.print("The number is odd");
        }
    }
}