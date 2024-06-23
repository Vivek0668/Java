import java.util.Scanner;

public class Io {
    public static void main(String[] args) {
//        System.out.print("Enter your roll no : ");
//        Scanner sc = new Scanner(System.in);
////        int rollno = sc.nextInt();
////        System.out.println("Your roll no is " + rollno);
//
//        String name = sc.next();
//        System.out.println(name);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String YourName = input.next();
        System.out.print("Enter Your Age: ");
        int YourAge = input.nextInt();
        System.out.print("Enter Your Marks: ");
        float YourMarks = input.nextFloat();

        System.out.println("Hello " + YourName + " Wish you a " + YourAge +"th birthday" + " and today is your result and You  scored a remarkable "+ YourMarks
                + " percentage ");


    }
}
