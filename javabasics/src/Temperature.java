import java.util.Scanner;


public class Temperature {
    public static void main(String[] args) {
        System.out.print("Enter the temp in C to converted in fahrenheit : ");
        Scanner sc = new Scanner(System.in);
        float tempC = sc.nextFloat();
        float tempf = (tempC * 9/5) + 32;
        System.out.println("Temperature in degree is : " + tempf);
    }
}
