public class MakeItNegative {
    public static void main(String[] args) {
        System.out.println(neg(10));

    }

    public static int neg(int n) {
        int c = ~n;

        return c+1;
    }


    }

