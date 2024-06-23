import java.util.Scanner;

public class Casecheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your word" + " ");
        char ch = sc.next().trim().charAt(0);
     if(ch >= 'a' && ch<= 'z'){
         System.out.print("Lowercase");
     }else {
         System.out.print("Uppercase");
     }
    }
}
