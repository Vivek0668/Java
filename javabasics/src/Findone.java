import java.util.Scanner;

public class Findone {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int value = sc.nextInt();
        System.out.print("Enter the digit : " );
        int digit = sc.nextInt();
        int count =0;
        while(value!=0) {
            int rem = value%10;
            if(rem==digit) {
                count++;
            }
            value = value/10;

        }
        System.out.println(count);


    }
}