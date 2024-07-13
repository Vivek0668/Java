package Sorting;



import java.util.Arrays;

public class Quick {

    public static void main(String[] args) {
        int [] arr = {4,5,63,77,4,1,0};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static  void sort(int[] arr, int low, int hi) {
        if(low>= hi) {
            return;
        }

        int start = low;
        int end = hi;
        int mid =start+ (end-start)/2;
        int pivot = arr[mid];

        while(start<= end) {
            while(pivot>arr[start]){
                start++;
            }
            while(pivot<arr[end]){
                end--;
            }
            if(start<=end) {
                int temp= arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        sort(arr,low,end);
        sort(arr,start,hi);
    }


}