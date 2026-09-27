package While_Loop;
import java.util.*;
public class While_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        boolean haslearn = false;
        while(!haslearn){
            System.out.println("Go to school and try to learn,");
            System.out.println("Have you understood?");
            haslearn = sc.nextBoolean();
        }
    }
    
}
