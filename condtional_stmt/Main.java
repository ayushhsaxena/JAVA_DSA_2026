package condtional_stmt;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // p1 age checker
        System.out.println("Enter age: ");
        int age  = sc.nextInt();

        if(age > 18){
            System.out.print("The person is an adult");
        }
        else{
            System.out.print("The person is not an adult");
        }
        
    }
}
