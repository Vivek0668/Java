public class armStrong {
    public static void main(String[] args) {
        System.out.println(isArm(153));


    }


    public static boolean isArm(int n) {
        int number =n;
        int sum=0;
        int rem ;
        while(n!=0) {
            rem = n%10;
            sum += rem*rem*rem;
            n/= 10;

        }
       return sum== number;
    }
}
