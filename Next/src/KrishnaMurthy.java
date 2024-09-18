public class KrishnaMurthy {
    public static void main(String[] args) {
        System.out.println(isKrihsna(40585));

    }

    public static boolean isKrihsna(int n) {
        int ogNumber = n;
        int sum= 0;
        int rem ;
        while(n>0) {
            rem = n%10;
            sum+= fact(rem);
            n/=10;

        }
        return ogNumber == sum;

    }

    public static int fact(int n) {
        if(n<2) {
            return 1;

        }
        int fact=1;
        for(int i=2;i<=n;i++){
            fact *= i;
        }
        return fact;


    }
}
