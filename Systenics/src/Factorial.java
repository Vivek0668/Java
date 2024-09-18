public class Factorial {
    public static void main(String[] args) {
        System.out.println(sum(4));

    }

    public static double sum (int n) {
        double sum =0.0;
        int i =1;
        while(i<=n){
            sum +=(double) i/fact(i);
            i++;
        }
        return sum;

    }

    public static int fact(int n) {

       int factorial = 1;
       for(int i=2;i<=n;i++) {
           factorial *= i;

       }
       return factorial;
    }
}
