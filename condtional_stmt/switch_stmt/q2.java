/*
Program: Simple Calculator using Switch Statement in Java

Description:
This program implements a basic calculator using the switch statement in Java.
It allows the user to perform different arithmetic operations on two numbers.

Working:
1. The program first imports the java.util package to use the Scanner class for user input.
2. It asks the user to enter two numbers (a and b).
3. A list of available operations is displayed:
      1 : Addition (+)
      2 : Subtraction (-)
      3 : Multiplication (*)
      4 : Division (/)
      5 : Modulo (%)
4. The user selects the operation by entering the corresponding serial number.
5. A switch statement is used to check the selected operation.
6. Based on the user's choice, the respective arithmetic calculation is performed.
7. The result is then printed on the console.
8. If the user enters an invalid option, the program displays an error message.

Concepts Used:
- Java Switch Statement
- Scanner Class for User Input
- Arithmetic Operators
- Conditional Execution

Purpose:
This program demonstrates how switch statements can be used to control program
flow when multiple choices are available.

Author: Ayush Saxena
*/

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
