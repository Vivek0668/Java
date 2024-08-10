package String;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        per("", "abc");

    }

    static void per(String pro, String unpro) {
        if(unpro.isEmpty()) {
            System.out.println(pro);
            return ;
        }


        char ch = unpro.charAt(0);
        for (int i = 0; i <=pro.length() ; i++) {
            String f = pro.substring(0,i);
            String s = pro.substring(i,pro.length());
            per(f + ch + s, unpro.substring(1));

        }







        }
}

