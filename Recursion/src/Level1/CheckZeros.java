package Level1;

public class CheckZeros {

    public static void main(String[] args) {
        System.out.println(Check(7000008, 0));


    }

    static int  Check(int n,int count) {
        if(n == 0) {
            
            return count;
        }

        int rem = n % 10;
        if(rem == 0) {
            return Check(n/10, count+1);
        }
        return Check(n/10, count);




    }
}
