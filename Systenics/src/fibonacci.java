public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));

    }

    public static int fib(int n) {
        if(n<2) {
            return n;
        }
        int count =1;
        int no1 =0;
        int no2 =1;
        while(count<n) {

            int no3 = no1+ no2;

            int temp = no3;
            no1 = no2;
            no2 = temp;

            count++;

        }
        return no2;
    }
}
