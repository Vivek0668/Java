import java.util.Scanner;

public class Methodsorfunctions {

    public static void main(String[] args) {
//        Greet();
//        sum();
//        int ans = sum2();
//        System.out.print("the ans from the function sum is : " + ans);
//        System.out.println(Hello());


        Scanner name = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String myname = name.nextLine();
        System.out.print(Mygreet(myname));




    }

    static void Greet() {
        System.out.println("Hello waddup! " );

    }

  //function printing the sum
    static void sum () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("The sum is : " + sum);
    }

    //function returning the sum
    static int sum2 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    //greet with string

    static String Hello () {
        return "Hello waddup !";
    }

    //greet with personalized string
    static String Mygreet(String name) {
        return "Hello waddup !" + name;

    }

}
