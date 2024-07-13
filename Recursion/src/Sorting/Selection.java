package Sorting;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int[] arr = {4,5,6,8,3,2,1};
        selection(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }

    static  void selection(int[]arr, int last_index) {
        if(last_index == 0) {
            return;
        }

        int maxINdex = max(arr,0,last_index);
        if(arr[last_index]<arr[maxINdex]) {
            int temp = arr[last_index];
            arr[last_index] = arr[maxINdex];
            arr[maxINdex] = temp;
        }
        selection(arr, last_index -1);


    }

    static  int max (int[] arr,int start,int end) {
        int max =start;

        for (int i = start; i <=end; i++) {
            if(arr[i]> arr[max]) {
                max = i;
            }
        }
        return  max;

    }
}
