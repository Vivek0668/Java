import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        swap(num1,num2);


    }


    static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.print( "the swapped ans is :"  +a + " " + b);
    }


}
