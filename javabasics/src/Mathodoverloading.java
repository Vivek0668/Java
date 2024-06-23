public class Mathodoverloading {
    public static void main(String[] args) {
        System.out.println(fun(2,3));
        System.out.println(fun(3,4,5));


    }

    static int fun(int a ,int b) {
        int sum = a + b;
        return sum;
    }
    static int fun(int a,int b,int c) {
        int operation = (a+b)* c;
        return operation;
    }
}
