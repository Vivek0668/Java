package Arrays;

import java.util.ArrayList;

public class MutliLinear {
    public static void main(String[] args) {
        int[] arr = {5,6,7,43,55,5};
        multi(arr,5,0);

        System.out.println(list);

    }
  static   ArrayList<Integer> list = new ArrayList<>(5);
    static void multi(int[] arr, int target,int index) {

        if(index== arr.length) {
            return ;

        }

        if(arr[index]== target) {
            list.add(index);
        }
        multi(arr, target,index+1);

    }
}
