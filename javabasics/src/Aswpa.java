import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aswpa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array : ");


        int[] arr = new int[5];
        for(int i= 0;i<arr.length ;i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Your array is : " + Arrays.toString(arr));


        System.out.print("Enter the two indices you want to swap : ");
        int index1 = input.nextInt();
        int index2 = input.nextInt();
        swap(arr,index1,index2);



    }
    static void swap(int [] arr,int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.print(Arrays.toString(arr) + " ");
    }
}
