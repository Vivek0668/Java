import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] ar = new int[6];
        System.out.print("Enter the array elements : "  + " ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = input.nextInt();
        }

        System.out.print("Enter the range : " + " ");
        int index1 = input.nextInt();
        int index2 = input.nextInt();
//        System.out.println("The maximum value is : " + max(ar));
        System.out.println("the maximum value in the range is : " + maxRange(ar, index1,index2));

    }

    static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;


    }
    static int maxRange(int[] arr, int index1,int index2) {
        int maxValue = arr[0];
        for (int i = index1 ; i < index2; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;


    }
}
