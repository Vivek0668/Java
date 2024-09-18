public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumofDigits(999));

    }

    public static int sumofDigits(int n) {
        int sum =0;
        while(n!= 0) {
            sum+= n%10;
            n/= 10;

        }
        return sum;
    }
}
