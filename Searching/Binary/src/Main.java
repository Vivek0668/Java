import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sorted array elements : ");
        int [] arr = new int[6];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter the element you want to search : ");
        int target = sc.nextInt();
        System.out.print(binary(arr,target));


    }

    static int binary(int [] arr, int target) {
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]) {
               end = mid-1;
            }else if(target>arr[mid]) {
               start= mid+1;
            }else {
                System.out.println("Element " + arr[mid] + " 1found  at index  " + mid );
                return mid;
            }

        }
        return -1;

    }
}