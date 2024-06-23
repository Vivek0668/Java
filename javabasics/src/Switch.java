import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        switch(fruit) {
            case "mango" :
                System.out.println("King of all fruits");
                break;
            case "pineapple" :
                System.out.println("Jack of all fruits");
                break;
            case "banana" :
                System.out.println("Straight of all the fruits");
                break;
            case "cheeku" :
                System.out.println("smallest of all fruits");
                break;
            default:
                System.out.println("No data available");

        }
    }
}
