package String;

import java.util.ArrayList;

public class Permutation2 {
    public static void main(String[] args) {
        System.out.println(perList("", "abcd"));

    }

    static ArrayList<String> perList(String pro, String unpro) {
        if (unpro.isEmpty()) {

            ArrayList<String> ans = new ArrayList<>();
            ans.add(pro);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();


        char ch = unpro.charAt(0);
        for (int i = 0; i <= pro.length(); i++) {
            String f = pro.substring(0, i);
            String s = pro.substring(i, pro.length());
            list.addAll(perList(f + ch + s, unpro.substring(1)));

        }
        return list;

    }
}
