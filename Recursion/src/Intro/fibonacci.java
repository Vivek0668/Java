package Intro;

public class fibonacci {
    public static void main(String[] args) {


  int ans = fib(4);
        System.out.println(ans);

    }

    static int fib(int n) {

        if(n<2) {
            return n;
        }

        int no1 = fib(n-1);
        int no2 = fib(n-2);
        int ans = no1 +  no2;
        return ans;





    }


}
