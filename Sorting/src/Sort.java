import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int[] arr2 = {2,1,4,5,3};
        int[] arr = new int[5];
        System.out.println("Enter the elements :");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();

        }
        cycle(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cycle (int [] arr) {
        for(int i =0;i<arr.length;i++) {
            int corr = arr[i] -1;
            if(arr[i] != arr[corr]) {
                int temp = arr[i];
                arr[i] = arr[corr];
                arr[corr] = temp;



            }
        }

    }
}
