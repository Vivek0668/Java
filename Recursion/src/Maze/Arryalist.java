package Maze;
import  java.util.ArrayList;

public class Arryalist {
    public static void main(String[] args) {
        System.out.println(print("",3,3));

    }


    static ArrayList<String> print(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);

            return list;
        }
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();

        if (r > 1) {
            left =print(p + 'D', r - 1, c);
        }
        if (c > 1) {
            right =print(p + 'R', r, c - 1);

        }
        left.addAll(right);
        return left;


    }
}
