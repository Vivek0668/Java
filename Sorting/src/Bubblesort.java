import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array elements : ");
        int [] arr = new int[5];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
      bubble(arr);
      for(int i=0;i<arr.length;i++) {
          System.out.print(arr[i] + " ");
      }

    }

    static void bubble(int [] arr) {
        boolean swapped;
        for(int i=0;i<arr.length;i++) {
            swapped = false;

            for(int j=1;j<=arr.length-i-1;j++) {
                if(arr[j-1]> arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}
