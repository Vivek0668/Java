import java.lang.reflect.Array;
import java.util.Arrays;

public class dupliii {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,6,6,7,7};
        System.out.println(Arrays.toString(removeDuplii(arr)));

    }

    public static int[] removeDuplii(int[] arr) {
        int j=0;
        int[] temp= new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            if(i==0 || arr[i]!= arr[i-1]) {
                temp[j++] = arr[i];
            }
        }
        int[] final_arr = Arrays.copyOfRange(temp,0,j);
        return final_arr;
    }
}

