package Arrays;

import java.util.ArrayList;

public class Arrraylist2 {
    public static void main(String[] args) {

        int[] arr = {4,5,6,4,5,6,7,7,7,88};

        System.out.println(check(arr,0,7));

    }
    static ArrayList<Integer> check (int[] arr , int index, int target) {

        ArrayList<Integer> list = new ArrayList<>(5);
        if(index == arr.length) {
            return list;
        }
        if(arr[index]== target) {
            list.add(index);
        }
        ArrayList below_ans = check(arr, index+1, target);
        list.addAll(below_ans);
        return list;

    }


}
