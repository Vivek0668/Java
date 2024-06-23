import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistt {
    public static void main(String[] args) {
//
//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(2);
//        list.add(1);
//        list.add(89);
//        list.add(66);
//        System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>(4);
        Scanner input = new Scanner(System.in);

        for(int i=0;i<4;i++) {
            list.add(input.nextInt());
        }
//      for(int i =0;i<4;i++) {
//          System.out.print(list.get(i) + " ");
//      }

        System.out.println(list);
//


    }


}
