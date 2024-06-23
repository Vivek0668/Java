import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the num1 : ");
        int num1 =input.nextInt();
        System.out.print("Enter the num2 : ");
        int num2 =input.nextInt();
        System.out.print("Enter the operation : ");
        int ans = 0;


        char op =input.next().trim().charAt(0);
        while(true) {
            if(op == '+' || op =='-' || op == '/' || op == '*') {
                if(op=='*') {
                   ans = num1 * num2;
                }
                if(op=='-') {
                    ans = num1 - num2;
                }
                if(op=='/')
                if(num1 !=0)
                {
                    ans = num1 / num2;
                }else {
                    System.out.println("0 is non divisible");
                    break;
                }
                if(op=='+') {
                    ans = num1 + num2;
                }
                System.out.print("Answer : " + ans);
                if(ans != 0) {
                    break;
                }

            }else if(op == 'x'){
                break;
            }else {
                System.out.println("Invalid Operation");
            }
        }

    }
}
