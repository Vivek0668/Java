import java.util.Arrays;

public class Varags {
    public static void main(String[] args) {
//        fun(34,5,632,67,2,8,3);
        multiple(78,66,"Sanji", "Zoro");


    }

    static void multiple (int num1 , int num2 , String ...a){
        System.out.println("The marks are are distributed evenly for the below students as : " + num1  +" " + num2 + " " + "The students name are "  +Arrays.toString(a)  );
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
