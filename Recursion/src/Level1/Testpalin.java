package Level1;

public class Testpalin {
    public static void main(String[] args) {
        int integer = 9119;
        System.out.println(rev(integer));
        System.out.println(ispalin(integer));

    }

    static int rev(int n) {
        int digits = (int)(Math.log10(n) + 1);
        return  helper(n, digits);
    }

    static int helper (int n , int digits) {
        if(n%10 == n) {
            return n;
        }
        int rem = n%10;
        int ans = (int)(rem*Math.pow(10, digits-1)) + helper(n/10, digits-1);
        return ans;

    }

    static boolean ispalin(int n) {
        if(n == rev(n)){
            return true;
        }else {
            return false;
        }

    }
}
