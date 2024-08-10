package String;

import java.util.ArrayList;
import java.util.List;

public class Trial2 {
    public static void main(String[] args) {
        System.out.println(ans("", 3,0,0, ""));

    }

    static List<String> ans(String current, int n, int open, int close, String tocheck) {
        if(current.length() == n*2) {
            List<String> list = new ArrayList<>();
            list.add(tocheck);
            return list;
        }

        List<String> openbrac = new ArrayList<>();
        List<String> closebrac = new ArrayList<>();

        if(open<n) {
            openbrac.addAll( ans(current+ "(", n,open+1, close, tocheck+ "wtf"));
        }
        if(close<open) {
            closebrac.addAll(ans(current+ ")", n , open,close+1 , tocheck+"yesfrr"));

        }

        openbrac.addAll(closebrac);
        return openbrac;




    }
}
