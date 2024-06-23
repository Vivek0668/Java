import java.util.Arrays;
import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args) {
        int [] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array elements : ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        selection(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void selection(int arr[])  {
        for(int i=0;i<arr.length;i++) {
            int LastIndex = arr.length-i-1;
            int MaxIndex = Max(arr,0,LastIndex);
            int temp = arr[MaxIndex];
            arr[MaxIndex] = arr[LastIndex];
            arr[LastIndex] = temp;
        }

    }
    static int Max(int arr[], int start, int end) {
        int max = start;
        for(int i=start;i<=end;i++) {
            if(arr[i]>arr[max]) {
                max = i;
            }
        }
        return max;

    }
}
