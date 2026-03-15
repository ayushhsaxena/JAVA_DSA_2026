package condtional_stmt.switch_stmt;
import java.util.*;
public class q2 {
    // Calculator using java switch
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double b = sc.nextDouble();

        System.out.println("1 : + (Addition) a + b");
        System.out.println("2 : - (Subtraction) a - b");
        System.out.println("3 : * (Multiplication) a * b");
        System.out.println("4 : / (Division) a / b");
        System.out.println("5 : % (Modulo or remainder) a % b");

        System.out.print("Enter the serial Number of the operation displayed above: ");
        int choice = sc.nextInt(); 

        switch (choice) {
            case 1: System.out.println("Result = "+ (a+b));
            break;

            case 2: System.out.println("Result = "+ (a-b));
            break;

            case 3: System.out.println("Result = "+ (a*b));
            break;

            case 4: System.out.println("Result = "+ (a/b));
            break;

            case 5: System.out.println("Result = "+ (a%b));
            break;

            default: System.out.println("Invalid operator choice");
            break;
        }
    }
}
