import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.Scanner;

public class Maxintwod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.print("Enter the array elements : ");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Linear(arr));

        int [] arrr = new int[3];


        String str = Arrays.toString(arrr);


    }
    static int Linear(int [][] arr) {
        int maxValue = Integer.MIN_VALUE;
        if(arr.length ==0) {
            return -1;

        }
        for(int row=0;row<arr.length;row++) {
            for(int col=0;col<arr[row].length;col++) {
                if(arr[row][col]>maxValue) {
                    maxValue = arr[row][col];


                }
            }

        }
        return maxValue;

    }
}
