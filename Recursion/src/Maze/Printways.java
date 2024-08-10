package Maze;

public class Printways {
    public static void main(String[] args) {
        print2("",0,0);    System.out.println();  print("", 3, 3);



    }

    static void print(String pro, int r, int c) {
        if (c == 1 && r == 1) {
            System.out.println(pro);
            return;
        }

        if (r > 1) {
            print(pro + 'D', r - 1, c);
        }
        if (c > 1) {
            print(pro + 'R', r, c - 1);

        }


    }

    static void print2(String pro, int r, int c) {
        if (c == 2 && r == 2) {
            System.out.println(pro);
            return;
        }

        if (r < 2) {
            print2(pro + 'D', r + 1, c);
        }
        if (c < 2) {
            print2(pro + 'R', r, c + 1);

        }


    }
}
