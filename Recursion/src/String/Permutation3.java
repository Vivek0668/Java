package String;

import java.util.ArrayList;

public class Permutation3 {
    public static void main(String[] args) {
        System.out.println(perCount("", "abcd"));

    }

    static int perCount(String pro, String unpro) {
        if (unpro.isEmpty()) {


            return 1;
        }


int count=0;

        char ch = unpro.charAt(0);
        for (int i = 0; i <= pro.length(); i++) {
            String f = pro.substring(0, i);
            String s = pro.substring(i, pro.length());
count= count+ (perCount(f + ch + s, unpro.substring(1)));

        }
        return count;

    }
}
