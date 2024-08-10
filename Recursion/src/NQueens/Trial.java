package NQueens;

public class Trial {
    public static void main(String[] args) {
        System.out.println( tryy(4, 0));

    }

    static  int tryy (int n, int currentindex) {
        if(n== currentindex) {
            return 1;
        }

        int count =0;
        count += tryy(n, currentindex+2);
        return count;

    }
}
