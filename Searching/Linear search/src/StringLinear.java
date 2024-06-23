import javax.sound.sampled.Line;
import java.util.Scanner;

public class StringLinear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String name = input.next();
        System.out.print("Enter the character you want to search : ");
        String ch = input.next();
        System.out.println(Linear(name,ch.charAt(0)));

    }

    static boolean Linear(String str, char target) {
        if(str.length()==0) {
            return false;
        }
        for(int i=0;i<str.length();i++) {
            char element = str.charAt(i);
            if(element == target) {

                return true;
            }
        }
        return false;

    }
}
