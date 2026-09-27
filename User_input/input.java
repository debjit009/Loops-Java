package User_input;
import java.util.Scanner;
public class input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();  // Integer //---> here you can write the data types you needed.
        double d = sc.nextDouble();    // Decimal
        String name = sc.next();       // word
        String text = sc.nextLine();   // line

        System.out.println("Your number is: " + n);
    }
}
    

