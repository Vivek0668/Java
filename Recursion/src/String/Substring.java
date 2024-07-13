package String;

public class Substring {
    public static void main(String[] args) {
         skip("abbacdd", "");



    }

    static  void skip(String que, String ans) {
        if(que.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = que.charAt(0);
        if(ch=='a') {
            skip(que.substring(1), ans);
        }else {
            skip(que.substring(1), ans+ch);
        }

    }
}
