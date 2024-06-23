import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int [] array = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array elements : ");
        for(int i=0;i<array.length;i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Enter the element you want to search : ");
        int target = input.nextInt();
        System.out.println(Linear(array,target));


    }

    static boolean Linear (int [] array, int target) {

       if(array.length== 0) {
           return false;

       }
       for(int i=0;i<array.length;i++) {
           int element = array[i];
           if(element  == target) {
               return true;
           }
       }
       return false;

    }
}
