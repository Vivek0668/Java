package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 44;
        int b= 0;


        try{
            divide(5,0);
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }finally {
            System.out.println("This will always execute");

        }


    }

    static int divide(int a, int b) throws ArithmeticException {
        if(b==0) {
            throw new ArithmeticException("plz dont put zzero");
        }
        return a/b;
    }


}
