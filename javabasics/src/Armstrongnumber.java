import java.util.Scanner;

public class Armstrongnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        System.out.println( isArmstrong(input));

        for(int i =1;i<=10000;i++) {
           if(isArmstrong(i)) {
               System.out.print(i + " ");
           }
        }

    }



    static boolean isArmstrong(int num1) {
        int sum = num1;

        int arm = 0;
        while (num1!=0){
            int rem = num1%10;

            arm = arm  + (rem*rem*rem);
            num1 = num1/10;

        }
        return sum == arm;

    }
}
