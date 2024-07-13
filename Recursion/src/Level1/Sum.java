package Level1;

public class Sum {
    public static void main(String[] args) {
        System.out.println(ope(5));

    }

    static int ope(int n) {
        if(n<=1) {
            return n;

        }
        int sum = n + ope(n-1);
        return sum;
    }
}
