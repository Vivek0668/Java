import java.util.Scanner;

public class NestedSwrich {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int digit = sc.nextInt();
        String result = sc.nextLine();
        String dep = sc.nextLine();



        switch(digit) {
            case 1:
                switch (dep) {




                    case "It" :
                        System.out.println("Got it department");
                        break;
                    case "Cs" :
                        System.out.println("Got cs department");

                }
                break;
            case 2:


                        switch(dep) {
                            case  "Mechanical" :
                                System.out.println("Got mechanical department");
                                break;
                            case "Civil" :
                                System.out.println("Got civil department");
                        }


            case 3:


                        switch(dep) {
                            case  "Peon" :
                                System.out.println("Got Peon department");
                                break;
                            case "Watchman" :
                                System.out.println("Got watchman department");
                        }

                break;
            default:
                System.out.println("FAILED");






        }


    }
}
