package String;

import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
        System.out.println(returnascii("abc", ""));

    }

    static ArrayList<String> returnascii (String up, String p) {

        ArrayList<String> list = new ArrayList<>();

        if(up.isEmpty()) {
            list.add(p);
            return list;
        }


        char ch = up.charAt(0);
        ArrayList<String>  first = returnascii(up.substring(1),p+ch);
        ArrayList<String> second = returnascii(up.substring(1), p);
        ArrayList<String>  third = returnascii(up.substring(1), p+(ch+0));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
