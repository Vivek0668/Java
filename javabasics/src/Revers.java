import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be reversed : ");
       int value = sc.nextInt();
       int reversed = 0;
        while(value != 0) {
            int rem = value %10;
            value = value /10;
            reversed = reversed *10 + rem;


        }
        System.out.print("the reversed number is : " +reversed);

    }
}