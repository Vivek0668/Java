import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Arrayex {
    public static void main(String[] args) {
//        //declarations
//        int[] arr = {4,5,6,3,4,6};
//        int[] arr2 = new int[4];

//        arr2[3]=4483;
//        String[] names = {"Raju", "chutki", "bheem", "kichak"};
////        System.out.println(names[3]);
////        System.out.println(arr[3]);
////        System.out.println(arr2[3]);
////
//        //printing arrays using arrays.tostring
////        System.out.println(Arrays.toString(arr));
//
//        //printing arrays using loop
//        for(int i = 0; i<arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }

        //input and output using array;

        Scanner input = new Scanner(System.in);
//
//        int [] Arr = new int[5];
//
//        for(int i =0; i<Arr.length; i++) {
//            Arr[i] = input.nextInt();
//        }
////        for(int i =0;i<Arr.length; i++)  {
////            System.out.print(Arr[i] + " " );
////        }
//
//        //another way for printing arr using foreach loop;
//
//        for(int num : Arr) {                 //for every element in array print the array
//            System.out.print(num + " ");     // here num presents element of the array;
//        }
//
        //array of objects

        String[] str = new String[5];

        for(int i=0;i<str.length;i++) {
            str[i] = input.next();
        }

//       for(int i =0;  i<str.length;i++) {
//           System.out.print(str[i] + " ");
//       }
       for(String numm : str) {
           System.out.print(numm + " ");
       }
//




    }
}
