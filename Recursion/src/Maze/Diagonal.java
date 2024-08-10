package Maze;
import  java.util.ArrayList;

public class Diagonal {
    public static void main(String[] args) {
        System.out.println(print("", 3,3));

    }

    static ArrayList<String> print(String p, int r, int c) {
        if(c==1 && r==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return  list;
        }
        ArrayList<String> ans = new ArrayList<>();


        if(r>1) {
            ans.addAll(print(p + 'V',r-1,c));


        }
        if(c>1) {
            ans.addAll(print(p + 'H', r,c-1));
        }
        if(c>1 && r>1) {
            ans.addAll(print(p+ 'D', r-1,c-1));
        }
        return ans;
    }
}
