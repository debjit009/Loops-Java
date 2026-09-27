package Loops_problem_Solve.Using_while;
import java.util.*;
public class N_noPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N no:");
        int n = sc.nextInt();

        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
    
}
