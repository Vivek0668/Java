import java.util.Scanner;

public class LoopsImplementation {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter first digit" + " ");
        int a = sc.nextInt();
        System.out.print("Enter second digit" + " ");
        int b = sc.nextInt();
        System.out.print("Enter third digit" + " ");
        int c = sc.nextInt();


//        int max =a;
//        if(b>max) {
//            max = b;
//        }if(c>max) {
//            max = c;
//        }
//        System.out.print("The maximum digit is :" + max);
//
        //another method

        int max = Math.max(a, Math.max(b,c));
        System.out.println("The maximum digit is :" + max);




    }
}
