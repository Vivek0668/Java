package Arrays;

import java.sql.Array;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        int[] arr = {4,4,4,4,4,4,4,7,7,7,8,9,90};
       ArrayList<Integer>  list = new ArrayList(4);
        System.out.println(check(arr,4,0,list));



    }

    static ArrayList<Integer> check (int arr[], int target, int index,  ArrayList<Integer> list) {
        if(index== arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return check(arr,target,index +1,list);



    }
}
