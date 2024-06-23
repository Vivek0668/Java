import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {


        //using while loop
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while(count<=n) {
//            int temp = b;
//            b =  b+a;
//            a = temp;
//            count++;
//
//
//        }
//        System.out.print(b);

        //using for loop
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int a =0;
        int b = 1;
        for(int i =2;i<= value; i++) {
            int temp = b;
            b = b+ a;
            a = temp;
        }

        if(value == 0) {
            System.out.println(a);
        }else {
            System.out.print(b + " ");

        }

    }
}
