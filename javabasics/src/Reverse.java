import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.print("Enter the array elements : " + " ");
        for(int i =0;i<arr.length;i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Your array is : " + " "+ Arrays.toString(arr));
        reverse(arr);



    }
    static void swap(int[] arr,int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end) {
            swap(arr,start,end);
            start ++;
            end --;
        }
        System.out.println("Your reversed array is : " + Arrays.toString(arr) );

    }

}
