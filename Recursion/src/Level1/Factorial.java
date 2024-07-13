package Level1;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fun(5));


    }

    static int fun(int n) {
        if(n<=1) {
            return 1;
        }
     int fact = n* fun(n-1);
        return fact;


    }
}
