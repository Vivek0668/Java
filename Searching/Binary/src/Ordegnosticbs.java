import java.util.Scanner;

public class Ordegnosticbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [7];
        System.out.print("Enter the array elements : ");

       for(int i=0;i<arr.length;i++) {
           arr[i] = sc.nextInt();
       }
        System.out.print("Enter the target element you want to search : ");
       int target = sc.nextInt();
        System.out.println(Binarys(arr,target));

    }

   static int Binarys(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while(start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]== target) {
                return mid;
            }
                 if(isAsc) {
                if(arr[mid]>target) {
                    end = mid-1;

                }else {
                    start = mid+1;
                }
            }else {
                if(arr[mid]<target) {
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return -1;


   }
}
