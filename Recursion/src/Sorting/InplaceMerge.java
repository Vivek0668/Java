package Sorting;

import java.util.Arrays;

public class InplaceMerge {
    public static void main(String[] args) {
        int[] arr = {4,5,7,4,3,2,1,};
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int arr[] ,int start, int end) {
        if(end-start==1) {
            return;
        }

        int mid = (start+end)/2;
        sort(arr,start,mid);
        sort(arr,mid,end);

        mergeINplace(arr, start,mid,end);


    }
    static  void mergeINplace(int arr[], int start, int mid, int end){
        int[] mix = new int[end-start];
        int i =start;
        int j = mid;
        int k =0;

        while(i<mid && j<end){
            if(arr[i]<arr[j]) {
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
             k++;
        }

        while(i<mid) {
            mix[k] = arr[i];
            k++;
            i++;
        }
        while(j<end) {
            mix[k] = arr[j];
            k++;
            j++;
        }

        for (int l = 0; l <mix.length ; l++) {
            arr[start+l] = mix[l];


        }

    }
}
