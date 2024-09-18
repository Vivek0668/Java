import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {9,0,3,2,2,4,8};
//        System.out.println(Arrays.toString(rev(arr)));
        revv(arr);
        System.out.println(Arrays.toString(arr));

    }


    //without using swapping
    public static int[] rev(int[] arr) {
        if(arr.length<2) {
            return arr;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            list.add(arr[i]);
        }
        int[] arr2 = new int[arr.length];
        int index =0;
        for(int j=arr2.length-1;j>=0;j--) {
            arr2[index] = list.get(j);
            index ++;
        }
        return arr2;
    }

    //using temp variable to swap;

    public static void revv(int[] arr) {
        if(arr.length<2) {
            return ;
        }
        int left = 0;
        int right = arr.length-1;
        while(left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] =temp;
            left++;
            right--;
        }

    }
}
