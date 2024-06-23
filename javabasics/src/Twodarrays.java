import java.util.Scanner;

public class Twodarrays {
    public static void main(String[] args) {

        //declarations

//        int [][] array = new int [3][];
//        int [][] arr = {
//                {1,2,3},//0th index
//                {1,2,},//1st index
//                {1,2,3,4,5,6}//2nd index
//        };

        //input
        Scanner input = new Scanner(System.in);

        int [][] arrr =  new int[3][3];

        for(int row =0;row<arrr.length;row++) {
            for(int col=0;col<arrr[row].length;col++) {
                arrr[row][col] = input.nextInt();
            }

        }

      for(int row=0;row<arrr.length;row++) {
          for(int  col =0;col<arrr[row].length;col++) {
              System.out.print(arrr[row][col] + " ");

          }
          System.out.println();
      }

//
//      int [] arr = {3,5,7,8,4};
//      for(int i=0;i<arr.length;i++) {
//          System.out.println(arr[i]);
//      }




    }
}
