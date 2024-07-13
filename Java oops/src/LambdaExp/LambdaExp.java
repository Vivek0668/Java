package LambdaExp;

import javax.swing.*;

public class LambdaExp implements  todo  {

    @Override
    public int meth(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        Operation obj = new Operation();
        int ans = obj.sum(3,4);
        System.out.println(ans);



    }

    todo  sum = (int a , int b) -> a + b;
    todo  sub = (int a,int b) -> a -b;
    todo mul = (int a, int b)-> a* b;
    todo div = (int a , int b) -> a /b;

    int doppp(int a, int b) {
        int ans =   a +  b;
        return ans;
    };


}


class Operation implements Lam {
    @Override
   public int sum (int a, int b) {

        int sum = a+ b;
        return sum;

    }
    @Override
    public int ope (int a, int b) {
        int ope = a -b;
        return ope;
    }



}

interface todo {
    int meth (int a , int b) ;

}
