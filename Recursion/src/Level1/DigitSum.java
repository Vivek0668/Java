package Level1;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(ope(505));

    }
    static int ope(int n) {
        if(n%10==n) {
            return n;
        }
        return ope(n/10) + n%10;
    }
}
