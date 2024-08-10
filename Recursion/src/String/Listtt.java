package String;

import java.util.ArrayList;
import java.util.List;

public class Listtt {

    public static void main(String[] args) {
        int[] arr = {5,6,7,41,1};
        System.out.println(sub(arr));

    }

    static List<List<Integer>> sub(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i <n ; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }

        } return outer;

    }

}
