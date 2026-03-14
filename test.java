/* 
import java.util.*;
public class test {
    public static void main(String[] args){ // THIS VOID MAIN is function that is used to perform any task
        System.out.println("Hello Test");
    }
}
*/
import java.util.*;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter a remark: ");
        String remarks = sc.nextLine();

        System.out.println(name + " is " + age + " years old and remark is " + remarks);
    }
}
