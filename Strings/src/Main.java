import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String a = "Luffy";
        String b = "Luffy";
//        System.out.println(a == b);
        String name = new String("Zoro");
        String name2 = new String("Zoro");

        System.out.println(name == name2);
        System.out.println(name.equals(name2));


    }
}